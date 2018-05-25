package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Task2LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        int id = Integer.parseInt(request.getParameter("id"));
        int pass = Integer.parseInt(request.getParameter("pass"));

        boolean loginFlag = false;

        HttpSession session = request.getSession(true);
        request.getSession(true);
        if (id == 1 && pass == 1) {
            loginFlag = true;
            session.setAttribute("bLogin", loginFlag);
            request.getRequestDispatcher("/task2Reader.jsp").forward(request, response);
        } else {
            session.setAttribute("bLogin", loginFlag);
            request.getRequestDispatcher("/task2Login.jsp").forward(request, response);
        }

    }

}
