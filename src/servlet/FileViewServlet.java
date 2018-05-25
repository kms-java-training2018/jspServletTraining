package servlet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FileViewServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        // セッションの定義
        HttpSession session = request.getSession();

        // idにセッション情報を代入
        String id = (String) session.getAttribute("sendLoginID");

        // セッションが切れたときのエラーメッセージ
        String sessionMsg = "セッションが切れました";

        // セッションが切れたら、login.jspページに戻る
        if (id == null) {
            //response.sendRedirect( "login.jsp" );
            request.setAttribute("sessionMsg", sessionMsg);
            request.getRequestDispatcher("/login.jsp").forward(request, response);
            return;
        }

        // fileの指定
        String fileName = request.getParameter("fileName");
        File file = new File(fileName);

        String fileMsg = "ファイルが存在しません";

        // 指定したファイルがなければ、このページ(file.jsp)にとどまりエラーメッセージを出力
        if (!file.exists()) {
            request.setAttribute("fileMsg", fileMsg);
            request.getRequestDispatcher("/file.jsp").forward(request, response);
            return;
        }


        BufferedReader f = new BufferedReader(new FileReader(file));
        ArrayList<String> list = new ArrayList<String>();

        String str;


        /*
         * ファイルを一行ずつ読み込み、最後の行まで読み込む。
         * 一行の内容を","ごとにTokenを区切る
         * Tokenごとに読み込み、listに入れる
         */
        while ((str = f.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(str, ",");
            while (st.hasMoreTokens()) {
                list.add(st.nextToken());
            }
        }

        f.close();


        request.setAttribute("fileRead", list);
        request.getRequestDispatcher("/fileView.jsp").forward(request, response);
    }
}