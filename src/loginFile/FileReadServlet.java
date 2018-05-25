package loginFile;

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
    /**
     * ファイル読み込み用のサーブレット
    */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String comment = "";
        /*
         * ログインページを踏んでいるか判別するリクエスト
         */
        String ok = request.getParameter("ok");
        request.setAttribute("ok", ok);
        /**
         *  セッション中か判断
         */
        HttpSession session = request.getSession(false);
        /*
         *  時間切れでセッション消えた場合
         *  消えた"id"をチェックしに行ってしまうのを避ける
         */
        if (session == null) {
            // ログイン画面に戻る
            comment = "セッションタイムアウト<br>";
            request.setAttribute("comment", comment);
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
        // セッションが消えていない場合
        if (session.getAttribute("id") != null && session.getAttribute("pass") != null && ok.equals("ok")) {
            // セッションが開始されている場合
            // 開く
            /**
             * ファイル名読み込み
             */
            // CSVファイルパスの取得
            String filename = request.getParameter("file");
            if (filename.equals("")) {
                // そもそも名前を入れなかった場合
                // ファイル入力画面へ
                comment = "名前を入れてください<br>";
                request.setAttribute("comment", comment);
                request.getRequestDispatcher("/fileOpen.jsp").forward(request, response);
            }
            // パス名作り
            String userHome = System.getProperty("user.home");
            File csv = new File(userHome + "/Desktop/" + filename + ".csv");
            String path = csv.getCanonicalPath();
            /**
             * ファイルの存在確認
             */
            if (!csv.exists()) {
                // ファイルが見つからなかった場合
                // ファイル入力画面へ
                comment = "ファイルが見つかりませんでした<br>";
                request.setAttribute("comment", comment);
                request.getRequestDispatcher("/fileOpen.jsp").forward(request, response);
            }
            /**
             * ファイル読み込み
             */
            BufferedReader reader = new BufferedReader(new FileReader(path));
            try {
                /*
                 * 読み込み用のlineと代入先のdata用意
                 * 複数行にも対応できるようArrayListにArrayListをいれる
                 */
                String line = "";
                ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
                // 一行ずつlineにとっていき最後まで回す
                while ((line = reader.readLine()) != null) {
                    // dataにいれるArrayListを用意
                    ArrayList<String> dataLow = new ArrayList<>();
                    // csvを,で分けてtokenに入れる
                    StringTokenizer token = new StringTokenizer(line, ",");
                    // tokenを最後までまわす
                    while (token.hasMoreTokens()) {
                        // ひとつずつtokenを一次元リストに入れていく
                        dataLow.add(token.nextToken());
                    }
                    // dataにdataLowを入れていく
                    data.add(dataLow);
                }
                reader.close();
                request.setAttribute("data", data);

            } catch (IOException e) {
                // 想定外のエラー
                System.out.println(e);
            }
            // 表示画面へ
            request.getRequestDispatcher("/fileDisp.jsp").forward(request, response);
        } else {
            // セッションが開始されていない場合
            // ログイン画面へ
            comment = "セッションタイムアウト<br>";
            request.setAttribute("comment", comment);
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }

    }

}
