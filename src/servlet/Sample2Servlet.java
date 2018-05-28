package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sample2Servlet extends HttpServlet{

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        String age = request.getParameter("age");

        request.setAttribute("age", age);

        int age1 =Integer.parseInt(age);
        if (age1 >= 20) {
            request.setAttribute("msg", "成人です");
        } else {
            request.setAttribute("msg", "未成年です");
        }

        request.getRequestDispatcher("/sample2Disp.jsp").forward(request, response);
    }
}
