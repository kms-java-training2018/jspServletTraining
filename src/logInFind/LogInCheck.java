package logInFind;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogInCheck extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        // 正解のIDとPassを宣言
        String idCheck = "ishii";
        String passCheck = "masahiro";

        // 入力されたIDとPassを取得
        String id = request.getParameter("id");
        String pass = request.getParameter("pass");

        // 入力されたIDとPassが正しいか判断
        if (id.equals(idCheck) && pass.equals(passCheck)) {

            // 合っていたら、セッション取得
            HttpSession session = request.getSession(true);

            session.setAttribute("id", id);

            session.setAttribute("pass", pass);

            session.setAttribute("logIn", "logIn");

         // 検索画面に処理を持っていく
            request.getRequestDispatcher("/find.jsp").forward(request, response);

        } else {
            // ログイン情報が間違っていたらやり直し
            request.getRequestDispatcher("/logIn.jsp").forward(request, response);

        }

    }
}
