package rogin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Rogout extends HttpServlet {

    // サーブレット
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        //ログアウトするよー
        // ログインできているか確認用だよ
        HttpSession session = req.getSession();
        // ログアウトしたよ
        session.setAttribute("Rogin", (Object)null);
        // ログインに戻るよ
        req.getRequestDispatcher("/rogin.jsp").forward(req, res);
    }
}
