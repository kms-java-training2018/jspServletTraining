package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Task1Servlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        String name = request.getParameter("nameInput");
        String age = request.getParameter("ageInput");

        PrintWriter out = response.getWriter();
        out.println("can you see?");

        request.setAttribute("name", name);
        request.setAttribute("age", age);
        request.getRequestDispatcher("/task1Disp.jsp").forward(request, response);
    }
}
