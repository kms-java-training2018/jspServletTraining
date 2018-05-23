package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Task1Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        String myName = request.getParameter("myName");
        String age = request.getParameter("age");

        request.setAttribute("myName", myName);
        request.setAttribute("age", age);

        request.getRequestDispatcher("/task1Disp.jsp").forward(request, response);
    }
}
