package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogInServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        // 入力されたユーザーIDとpasswordを取得
        String id = request.getParameter("id");
        String password = request.getParameter("password");

        //パスワード真偽確認
        if (id.equals("goto") == true && password.equals("510") == true) {
            //セッション情報の新規作成
            HttpSession session = request.getSession(true);
            //セッションオブジェクトに保存する
            session.setAttribute("user", id);
            session.setAttribute("pass", password);


            request.setAttribute("id", id);
            request.getRequestDispatcher("/logIn2.jsp").forward(request, response);

        } else {
            request.getRequestDispatcher("/logIn.jsp").forward(request, response);
        }

    }
}
