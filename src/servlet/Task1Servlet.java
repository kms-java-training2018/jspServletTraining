package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Task1Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        String name = request.getParameter("name");
        String tosi = request.getParameter("age");
        String check = request.getParameter("check");

        request.setAttribute("name", name);
        request.setAttribute("nennrei", tosi);
        request.setAttribute("check", check);

        request.getRequestDispatcher("task1Disp.jsp").forward(request, response);
    }
}
