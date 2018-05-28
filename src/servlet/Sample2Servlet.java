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
        response.setContentType("text/html; charset=UTF-8");

        String age = request.getParameter("age");
        String birthMonth = request.getParameter("birthMonth");
        String birthDay = request.getParameter("birthDay");
        String msg = "成人です";
        int ageif = Integer.parseInt(age);
        if(ageif >= 20) {
            msg = "成人です";
        } else {
            msg ="未成年です";
        }


        request.setAttribute("age", age);
        request.setAttribute("birthMonth", birthMonth);
        request.setAttribute("birthDay", birthDay);
        request.setAttribute("msg", msg);
        request.getRequestDispatcher("/sample2Disp.jsp").forward(request, response);
    }
}
