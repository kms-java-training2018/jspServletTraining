package servlet;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FileReaderServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        String csv = request.getParameter("csv");
        HttpSession session= request.getSession();

        // セッションが切れていた場合、ログイン画面に戻る
        if(session.getAttribute("name") == null || session.getAttribute("pass") == null) {
            request.getRequestDispatcher("/login.jsp").forward(request, response);
            return;
        }

        // sessionの値のとり方・String変換
        //String name = (String)session.getAttribute("name");

        // ファイル読み込み
        FileReader fr = new FileReader(csv);
        BufferedReader reader = new BufferedReader(new FileReader(csv));

        try {

            String line;
            line = reader.readLine();
            System.out.println(line);

            // 出力
            reader.close();
            fr.close();

            request.setAttribute("file", line);
            request.getRequestDispatcher("/loginFileDisp.jsp").forward(request, response);


        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません" + e);
        } catch (IOException e) {
            System.out.println("エラーです" + e);
        }
    }
}
