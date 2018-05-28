package servlet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FileDesServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        HttpSession session = request.getSession();
        String id = (String) session.getAttribute("id");
        String pw = (String) session.getAttribute("pw");

        if (!("1234".equals(id)) || !("5678".equals(pw))) {
            request.getRequestDispatcher("/loginCheck.jsp").forward(request, response);
        }

        try {//ファイルの指定
            String filename = request.getParameter("filename");
            File file = new File(filename);
            ArrayList<String> list = new ArrayList<String>();
            //読み込み
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line = "";

            //String content = "";
            while ((line = reader.readLine()) != null) {
                // 1行をデータの要素に分割
                StringTokenizer file2 = new StringTokenizer(line, ",");
                while (file2.hasMoreTokens()) {
                    list.add(file2.nextToken());
                    //System.out.println(list);
                }
            }
            reader.close();
            request.setAttribute("file2", list);
            request.getRequestDispatcher("/reference.jsp").forward(request, response);

        } catch (FileNotFoundException e) {
            // Fileオブジェクト生成時の例外捕捉
            e.printStackTrace();
        } catch (IOException e) {
            // BufferedReaderオブジェクトのクローズ時の例外捕捉
            e.printStackTrace();
        }

        // CSVファイルを読み込み表示
        //String line = "";
        //while ((line = br.readLine()) != null) {
        // 1行分のデータを「,」で分割
        //StringTokenizer st = new StringTokenizer(line, ",");

        //out.println("行のデータ<br>");
        //while (st.hasMoreTokens()) {
        // 分割したデータの表示
        //out.println(st.nextToken() + "<br>");
        //}
        //br.close();
    }
}
