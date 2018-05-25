package servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FileServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        // PW/IDの設定
        // ID
        final String uid = "hanawa";
        // PW
        final String upw = "1234";

        // login.jspから、loginID/loginPWのパラメータ入手
        String sendLoginPW = request.getParameter("loginPW");
        String sendLoginID = request.getParameter("loginID");

        // ID/PWが間違えているときのエラーメッセージ
        String pwMsg = "パスワードが間違っています";

        // ID/PWの一覧設定
        Map<String, String>map = new HashMap<String, String>();
        map.put("hanawa", "1111");
        map.put("takatsuka", "2222");
        map.put("teranoshita", "3333");
        map.put("iijima", "4444");
        map.put("mitsuno", "5555");
        map.put("oonishi", "6666");
        map.put("okimoto", "7777");

        if(!map.containsKey(sendLoginID)) {
            // ID/PWが一致していないとき
            // エラーメッセージの表示
            request.setAttribute("pwMsg", pwMsg);
            // login.jspにとどまる
            request.getRequestDispatcher("/login.jsp").forward(request, response);
            return;
        }
        // ID/PWが入力されなかったときのエラーメッセージ
        String erroMsg = "入力をしてください";

        // ID/PWが入力されなければエラーメッセージを出力
        if(sendLoginID == ""  || sendLoginPW == "") {
            request.setAttribute("pwMsg", erroMsg);
            request.getRequestDispatcher("/login.jsp").forward(request, response);
            return;
        }


        // セッションの定義
        HttpSession session = request.getSession();



        // ID/PWが一致すれば、次のページ(file.jsp)へ
        // 一致しなければ、このページ(login.jsp)にとどまる
        if(map.get(sendLoginID).equals(sendLoginPW)) {
            // セッションを持たせる
            session.setAttribute("sendLoginID", sendLoginID);
            // セッション情報を5秒持たせる
            session.setMaxInactiveInterval(5);
            // file.jspページへ飛ぶ
            request.getRequestDispatcher("/file.jsp").forward(request, response);
            return;
        }else {
            // ID/PWが一致していないとき
            // エラーメッセージの表示
            request.setAttribute("pwMsg", pwMsg);
            // login.jspにとどまる
            request.getRequestDispatcher("/login.jsp").forward(request, response);
            return;
        }




    }
}
