package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginCheckServlet extends HttpServlet {
    String id2 = "1234";
    String pw2 = "5678";

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        //id,pwを代入
        String id = request.getParameter("id");
        String pw = request.getParameter("pw");

        //セッション取得
        HttpSession session = request.getSession();

        //ログイン成功
        if ((id.equals(id2) && (pw.equals(pw2)))) {
            session.setAttribute("id", id);
            session.setAttribute("pw", pw);
            request.getRequestDispatcher("/homePage.jsp").forward(request, response);
        } else { //失敗
            request.getRequestDispatcher("/loginCheck.jsp").forward(request, response);
        }

    }

}
