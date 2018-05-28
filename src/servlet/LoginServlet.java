package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.LoginBean;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        LoginBean bean = new LoginBean();
        /**
         * ログインできる値の設定
         * 変数宣言
         */
        bean.setId("Toko");
        bean.setPassword("249");
        String id = request.getParameter("id");
        String password = request.getParameter("password");

        /**
         * ログイン成功→sessionに一致したidとpasswordを渡し、"/file.jsp"へフォワード
         * ログイン失敗→ログイン画面(login.jsp)へ戻る
         */
        if(bean.getId().equals(id) && bean.getPassword().equals(password)){
            HttpSession session = request.getSession();
            session.setAttribute("id", id );
            session.setAttribute("password", password);
            request.getRequestDispatcher("/file.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }

    }

}
