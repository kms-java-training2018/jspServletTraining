package loginFile;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BackServlet extends HttpServlet {
    /**
     * ファイル読み込みに戻る用のサーブレット
    */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String comment = "";
        // セッション破棄されてたら
        HttpSession session = request.getSession(false);
        if (session == null) {
            // ログイン画面に戻る
            comment = "セッションタイムアウト<br>";
            request.setAttribute("comment", comment);
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
        /*
         * ログインページを踏んでいるか判別するリクエストチェック
         */
        String ok = request.getParameter("ok");
        request.setAttribute("ok", ok);
        // 踏んでなかった場合
        if (!ok.equals("ok")) {
            comment = "セッションタイムアウト<br>";
            request.setAttribute("comment", comment);
            // ログイン画面に戻る
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
        // ファイル選択に戻る
        request.getRequestDispatcher("/fileOpen.jsp").forward(request, response);
    }

}
