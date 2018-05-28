package loginFile;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
    /**
     * ログイン処理用のサーブレット
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /*
         * 正解のパスワードをPASSに設定
         * とりあえずString型
         * commentはエラー文表示用
         */
        final String ID = "1";
        final String PASS = "1";
        String id = request.getParameter("id");
        String pass = request.getParameter("pass");
        HttpSession session = request.getSession(false);
        String comment = "";

        if (ID.equals(id) && PASS.equals(pass)) {
            // パスワード、IDがあっている場合
            // セッション開始
            session = request.getSession(true);
            session.setAttribute("id", id);
            session.setAttribute("pass", pass);
            // リクエストにもログイン情報もたせてみる
            String ok = "ok";
            request.setAttribute("ok", ok);
            // ファイル読み込み画面に移る
            request.getRequestDispatcher("/fileOpen.jsp").forward(request, response);

        } else {
            // 間違っている場合もう一度ログイン画面へ
            comment = "パスワード、IDが不正です<br>もう一度入力してください<br>";
            request.setAttribute("comment", comment);
            request.getRequestDispatcher("/login.jsp").forward(request, response);

        }
    }
}
