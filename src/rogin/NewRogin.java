package rogin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NewRogin extends HttpServlet {
    // サーブレット
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        // 文字データを受け取る
        // 入力されたパスワードとid取得
        String setPass = req.getParameter("pass");
        String setid = req.getParameter("id");
        // どっちも入力されていたときにログイン情報登録
        if (setPass != "" && setid != "") {

            // ファイルを探すよ
            File filePass = new File("C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\PassId\\Pass.csv");
            File fileId = new File("C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\PassId\\Id.csv");

            // 同じパスワードがあるかどうか確認するよ
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePass), "SJIS"));
            // 挿入用変数
            String line;
            // 判定用変数
            boolean checkPass = false;
            while ((line = reader.readLine()) != null) {
                // 一行ずつ確認するよ
                if (line.equals(setPass)) {
                    checkPass = true;
                }
            }
            // リーダーを閉じるよ
            reader.close();
            // 同じパスワードが使用されていたので終了
            if (checkPass) {
                req.setAttribute("notPass", "そのPassはすでに使用されています");
                // 新規登録に戻る
                req.getRequestDispatcher("/newRogin.jsp").forward(req, res);
            } else {

            // パスワードの設定を刷るよ
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filePass, true)));
            reader = new BufferedReader(
                    new InputStreamReader(new FileInputStream(filePass), "UTF-8"));
            writer.println(setPass);
            reader.close();
            writer.close();
            // IDの設定をするよ
            writer = new PrintWriter(new BufferedWriter(new FileWriter(fileId, true)));
            reader = new BufferedReader(
                    new InputStreamReader(new FileInputStream(fileId), "UTF-8"));
            writer.println(setid);
            reader.close();
            writer.close();
            // タイトルに戻る
            req.getRequestDispatcher("/rogin.jsp").forward(req, res);
            }
        } else {
            req.setAttribute("notPass", "IDかPassが未入力です");
            // 新規登録に戻る
            req.getRequestDispatcher("/newRogin.jsp").forward(req, res);
        }
    }
}
