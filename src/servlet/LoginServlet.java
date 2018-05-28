package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");


        String user = request.getParameter("user");
        String password = request.getParameter("password");

        //セッションの作成
        HttpSession session = request.getSession();

        //セッションに情報を持たせる
        session.setAttribute("user", user);
        session.setAttribute("password", password);

        //5秒でセッション切れる
        session.setMaxInactiveInterval(5) ;

        //ユーザーIDはadmin、パスワードはadmin
        if ("admin".equals(user)&&"admin".equals(password)) {
            request.getRequestDispatcher("/fileRead.jsp").forward(request, response);

        } else {
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }
}
