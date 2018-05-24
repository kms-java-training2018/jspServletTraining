package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Task1Servlet extends HttpServlet{

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        //名前取得
        String name = request.getParameter("name");
        //年齢取得
        String age = request.getParameter("age");

        //名前をセット
        request.setAttribute("name", name);
        //年齢をセット
        request.setAttribute("age", age);

        request.getRequestDispatcher("/task1Disp.jsp").forward(request, response);
    }
}
