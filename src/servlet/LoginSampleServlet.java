package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginSampleServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        //パスワードの設定
        final String id1 = "1111";
        final String pass1 = "1111";

        //
        String id = request.getParameter("id");
        String pass = request.getParameter("pass");

        //セッションの作成
        HttpSession session = request.getSession(true);
        session.setAttribute("id", id);
        session.setAttribute("pass", pass);

        //id,pass判定
        if (id1.equals(id) && pass1.equals(pass)) {
            session.setMaxInactiveInterval(10);
            request.getRequestDispatcher("/login1Disp.jsp").forward(request, response);
        } else {
            String erLogin = "IDまたはパスワードが違います";
            request.setAttribute("erLogin",erLogin );
            request.getRequestDispatcher("/loginInit.jsp").forward(request, response);
        }
    }
}
