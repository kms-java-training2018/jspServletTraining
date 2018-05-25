package task2;
/**
 * 課題2
 * 一つ目のサーブレット
 * ログイン画面からユーザIDとパスワードを受け取り、
 * それをsessionスコープに乗せて
 * ファイルの指定画面に送る
 */
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Task2ServletFirst extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        //task2Loginで指定されたuserId、passwordというパラメータを受け取り、
        //それぞれ変数に格納(データの降り口)
        String userId = request.getParameter("userId");
        String password = request.getParameter("password");

        //間違ったID、パスワードが入った時の処理  (ログインページに戻す)
        if(!userId.equals("ishikawa") || !password.equals("fukumi")) {
            System.out.println("ユーザIDまたはパスワードが正しくありません。");
            request.getRequestDispatcher("/task2Login.jsp").forward(request, response);

        }else {
        //正しいID、パスワードが入った時の処理

        //sessionスコープを使うための下準備
        HttpSession session = request.getSession();

        //変数に格納したデータをsessionスコープで保存
        //userIdとpasswordという名前をそれぞれつける(データの乗り口)
        session.setAttribute("userId", userId);
        session.setAttribute("password", password);

        //task2SelectFileへフォワード
        request.getRequestDispatcher("/task2SelectFile.jsp").forward(request, response);
        }
    }
}
