package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SampleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String myname = "53万"; //ここに名前を入力
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>あなたの戦闘力</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p>私の戦闘力は");
        out.println("<br>" + myname + "です。");
        out.println("</p>");
        out.println("</body>");
        out.println("</html>");
    }

}
