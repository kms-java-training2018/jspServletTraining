package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sample2Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        String age = request.getParameter("age");
        String hobby = request.getParameter("hobby");
        int ageInt = Integer.parseInt(age);

        request.setAttribute("age", age);
        request.setAttribute("hobby", hobby);
        request.setAttribute("ageInt", ageInt);
        request.getRequestDispatcher("/sample2Disp.jsp").forward(request, response);

    }

}
