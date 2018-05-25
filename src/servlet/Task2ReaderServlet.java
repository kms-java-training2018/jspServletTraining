package servlet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *	Task2ReaderServlet 課題2ファイル読み込み
 * @author teranoshita-yuta
 */
public class Task2ReaderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //文字コード設定
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        // 変数宣言
        boolean bLogin = true; // ログインしているかどうかの判定用
        String line; // 入力した文字列の格納

        // ArrayListの生成
        ArrayList<String> list = new ArrayList<String>();

        // セッションの生成
        HttpSession session = request.getSession(true);

        // ログイン判定
        if (session.getAttribute("bLogin") == null) {
            bLogin = false;
        }

        // セッションスコープ内変数の削除
        session.removeAttribute("bLogin");

        // ログイン判定
        if (!bLogin) {
            request.getRequestDispatcher("/task2Login.jsp").forward(request, response);
        }

        // filenameの中身（パスの名前）の取得
        String fileName = request.getParameter("filename");

        // String型からパスに変換
        File file = new File(fileName);

        // ファイル読み込みの準備
        BufferedReader reader = new BufferedReader(new FileReader(file));//C:\\Users\\teranoshita-yuta\\newfile.csv
        //C:\pleiades\workspace\javaBasic\javaBasic\src\kosugaquest
        // ArrayListへの追加
        while ((line = reader.readLine()) != null) {
            list.add(line);
        }
        // readerのクローズ
        reader.close();

        // dataという名前でlistを格納
        request.setAttribute("data", list);

        request.getRequestDispatcher("/task2Result.jsp").forward(request, response);
    }
}
