package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sample2Servlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        String age = request.getParameter("age");

        String mono = request.getParameter("mono");

        request.setAttribute("age", age);
        request.setAttribute("mono", mono);


        request.getRequestDispatcher("/sample2Disp.jsp").forward(request, response);


    }


}
