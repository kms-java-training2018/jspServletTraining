package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        res.setContentType("text/html; charset=UTF-8");

        //IDとパスワードを取得
        String userId = req.getParameter("userid");
        String password = req.getParameter("password");

        //セッション取得
        HttpSession session = req.getSession();

        //セッションスコープにインスタンスを保存
        session.setAttribute("userid", userId);
        session.setAttribute("password", password);

        //セッションの有効時間を変更
        session.setMaxInactiveInterval(10);

        //認証判定
        //ユーザーIDはuserid、パスワードはpassword
        if ("userid".equals(userId) && "password".equals(password)) { //認証成功

            //ファイル認証画面へ進む
            req.getRequestDispatcher("/fileRead.jsp").forward(req, res);
        } else { //認証失敗

            //ログイン画面へ戻る
            req.getRequestDispatcher("/login.jsp").forward(req, res);
        }

    }
}
