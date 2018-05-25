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

public class FileServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        String csv = request.getParameter("csv");

        //セッション有無チェック
        HttpSession session = request.getSession(false);
        if (session == null) {
            request.getRequestDispatcher("/logIn.jsp").forward(request, response);
        } else {
            System.out.println("処理継続");
        }

        //Httpsessionからオブジェクト取り出し
        String id = session.getAttribute("user").toString();

        String password = session.getAttribute("pass").toString();
        if (!(id.equals("goto"))) {
            request.getRequestDispatcher("/logIn.jsp").forward(request, response);
        } else if (!(password.equals("510"))) {
            request.getRequestDispatcher("/logIn.jsp").forward(request, response);
        }

        // 入力ストリームを作成。
        FileReader fr = new FileReader(csv);
        BufferedReader reader = new BufferedReader(new FileReader(csv));
        String line = "";
        try {
            // 読込み
            line = reader.readLine();
            System.out.println(line);

            // 入力・出力ストリームを閉じる。
            reader.close();
            fr.close();

        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }

        request.setAttribute("file", line);
        request.getRequestDispatcher("/file.jsp").forward(request, response);

    }

}
