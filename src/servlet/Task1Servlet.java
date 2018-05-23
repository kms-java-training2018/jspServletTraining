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

        /*
         * postで送られてきた値で変数を初期化
         */
        String name = request.getParameter("name");
        String age = request.getParameter("age");

        /*
         *  送信する変数名と値を紐つけ
         *  送信先で呼び出すにはここでつけた名前でなきゃだめ
         *  変数名じゃなくてメソッドでも戻り値があればいい？
         */
        request.setAttribute("outName", name);
        request.setAttribute("outAge", age);
        /*
         * 送信
         */
        request.getRequestDispatcher("/task1Disp.jsp").forward(request, response);
    }

}
