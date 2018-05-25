package rogin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RoginServlet extends HttpServlet {
    // サーブレット
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        // パスワードとidの参照先取得
        RoginBean bean = new RoginBean();
        // ファイルを探すよ
      //File 変数名   = new File (絶対パス);
        File filePass = new File("C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\PassId\\Pass.csv");
        File fileId = new File("C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\PassId\\Id.csv");
        if (filePass.exists() && fileId.exists()) {
            //ファイルが存在していたよ
            try {
                // パスワードを設定するよ
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(new FileInputStream(filePass), "UTF-8"));
                // 格納用変数
                String line;
                while ((line = reader.readLine()) != null) {
                    // 一行ずつ入れるよ
                    bean.setListPass(line);
                }
                // リーダーを閉じるよ
                reader.close();
                // IDを設定するよ
                reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileId), "UTF-8"));
                while ((line = reader.readLine()) != null) {
                    // 一行ずつ入れるよ
                    bean.setListId(line);
                }
                // リーダーを閉じるよ
                reader.close();
            } catch (FileNotFoundException e) {
                // ファイルが無かったよ
                req.getRequestDispatcher("/rogin.jsp").forward(req, res);
            }
        }
        // 入力されたパスワードとid取得
        String setPass = req.getParameter("pass");
        String setid = req.getParameter("id");
        // ログインできるかどうかの判定
        boolean rog = false;
        // 入力された値が同じかどうか確認
        for (int i = 0; i < bean.listId.size(); i++) {
            // 同じならば次の場所に飛べる判定を真にする
            if (bean.getListPass().get(i).equals(setPass) && bean.getListId().get(i).equals(setid)) {
                rog = true;
            }
        }
        // ログインできるかどうか判定
        if (rog) {
            // 正しければ指定先に飛ぶ
            // パスワードが入力されているか情報をセットする
            HttpSession session = req.getSession();
            session.setAttribute("Rogin", bean);
            req.getRequestDispatcher("/fileSet.jsp").forward(req, res);
        } else {
            // 違うのなら元の場所に戻る
            req.setAttribute("rog", "IDかパスワードが間違っています");
            req.getRequestDispatcher("/rogin.jsp").forward(req, res);
        }
    }
}
