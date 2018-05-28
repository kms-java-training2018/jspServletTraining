package servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
//====宣言==============================================================================================================
//----フィールド--------------------------------------------------------------------------------------------------------
    // 正解のIDとパスワードを設定
    static final String correctId = "aaa";
    static final String correctPass = "aaa";

//----メソッド----------------------------------------------------------------------------------------------------------
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        // リクエストからセッションを取得
        HttpSession session = request.getSession();



        // パラメータの値(入力された値)を変数に代入
        String inputId = request.getParameter("inputId");
        String inputPass = request.getParameter("inputPass");

        // 入力された値が正しいか判定
        if (inputId.equals(correctId) && inputPass.equals(correctPass)) {

            // ログイン情報.
            Map<String, String> map = new HashMap<String, String>();
            map.put( "id", inputId );
            map.put( "pass", inputPass );

            // ログイン情報をセッションに保存.
            session.setAttribute( "login_user", map );

            request.getRequestDispatcher("/task2SelectFile.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("/task2Login.jsp").forward(request, response);
        }

    }
}
