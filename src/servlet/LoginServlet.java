package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        // ログイン画面からパラメーター受け取る
        String name = request.getParameter("name");
        String pass = request.getParameter("pass");

        // ログイン情報をセッションにセット
        HttpSession session = request.getSession();
        session.setAttribute("name", name);
        session.setAttribute("pass", pass);

        // 正しいユーザー名とパスワードの設定
        String user = "yuji";
        String password = "0621";


        // セッションに値が保持されているか確認
        request.setAttribute("sessionName",session.getAttribute("name"));
        request.setAttribute("sessionPass",session.getAttribute("pass"));

        // 次の画面に渡すために値をセット
        request.setAttribute("name", name);
        request.setAttribute("pass", pass);


        // 入力が正しいか間違っているか
        // 入力が正しい場合
        if (name.equals(user) && pass.equals(password)) {

            // ログイン成功の画面に飛ぶ
            request.getRequestDispatcher("/loginFile.jsp").forward(request, response);

            // 入力が間違っている場合
        } else {

            // ログイン入力画面に戻る
            request.getRequestDispatcher("/login.jsp").forward(request, response);

        }

    }

}
