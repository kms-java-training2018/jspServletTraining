package servlet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FileReadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // 出力の準備
        response.setContentType("text/html; charset=UTF-8");

        String filename = request.getParameter("filename");

        HttpSession session = request.getSession();
        session.setAttribute("filename", filename);

        String id = (String) session.getAttribute("user");
        if (id == null) {
            request.getRequestDispatcher("/login.jsp").forward(request, response);
            return;
        }

        if ("data.csv".equals(filename)) {

            // CSVファイルパスの取得
            String path = "C:\\Users\\okimoto-kei\\Desktop\\data.csv";
            // CSVファイルを開く
            File csv = new File(path);
            BufferedReader br = new BufferedReader(new FileReader(csv));

            // CSVファイルを最終行まで読み込み表示
            String line;

            ArrayList<String> list = new ArrayList<String>();

            while ((line = br.readLine()) != null) {
                // 1行分のデータを「,」で分割
                StringTokenizer st = new StringTokenizer(line, ",");
                while (st.hasMoreTokens()) {
                    // 分割したデータの表示
                    list.add(st.nextToken());
                }
            }
            br.close();

            request.setAttribute("csv", list);
            request.getRequestDispatcher("/readComplete.jsp").forward(request, response);

        } else {
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }

}
