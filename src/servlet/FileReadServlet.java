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

public class FileReadServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        //出力の準備
        req.setCharacterEncoding("UTF-8");
        res.setContentType("text/html; charset=UTF-8");


        //ファイル名を取得
        String filename = req.getParameter("filename");


        //セッション取得
         HttpSession session = req.getSession();

        //セッションスコープにインスタンスを保存
        session.setAttribute("filename", filename);


        //セッション変数の取得
        String id = (String)session.getAttribute("userid");

        //id情報を持っていない場合はログイン画面へ戻る
        if(id == null) {
            res.sendRedirect("/jspServletTraining/login.jsp");
            return;
        }


        //ファイル名判定
        if("課題用.csv".equals(filename)) { //認証成功

            //ファイル内容出力

            //csvファイルパスの取得
            String path = "C:\\Users\\noda-ayumi\\Desktop\\課題用.csv";

            //csvファイルを開く
            File csv = new File(path);
            BufferedReader reader = new BufferedReader(new FileReader(csv));

            //csvファイルを最終行まで読み込み表示
            String line;

            //ArrayListのインスタンスを確保
            ArrayList<String> list = new ArrayList<String>();

            //
            while ((line = reader.readLine()) != null) {
                //一行分のデータを「,」で分割
                StringTokenizer st = new StringTokenizer(line, ",");

                while (st.hasMoreTokens()) {
                    list.add(st.nextToken());
                }

            }
            reader.close();

            req.setAttribute("csv", list);

            req.getRequestDispatcher("/fileDisp.jsp").forward(req, res);
        } else { //認証失敗

            //ファイル認証画面へ戻る
            req.getRequestDispatcher("/fileRead.jsp").forward(req, res);
        }


    }
}
