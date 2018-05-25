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
        boolean errFlag = true;
        try {
            int age = Integer.parseInt(request.getParameter("age"));
            request.setAttribute("age", age);
            errFlag = false;
        } catch (NumberFormatException e) {
            String err = "年齢が間違っています。";
            request.setAttribute("errMessage", err);
        }

        if (errFlag) {
            request.getRequestDispatcher("/sample2.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("/sample2Disp.jsp").forward(request, response);
        }
    }

}
