package rogin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FileServlet extends HttpServlet {
    // サーブレット
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        // ログインできているか確認用だよ
        HttpSession session = req.getSession();

        // ログインできているか確認するよ
        if (session.getAttribute("Rogin") != null) {
            // ファイルを探すよ
            File file = new File("C:\\Users\\"+ System.getProperty("user.name") +"\\Desktop\\" + req.getParameter("fileName") + ".csv");
            //File file = new File("C:\\Users\\takahashi-akira\\Desktop\\" + req.getParameter("fileName") + ".csv");
            // ファイルがあるかどうか確認するよ
            if (!file.exists()) {
                // ファイルが無かったことを伝えるよ
                req.setAttribute("notFile", "ファイルが存在しませんでした");
                // ファイルが無かったから戻るよ
                req.getRequestDispatcher("/fileSet.jsp").forward(req, res);
            } else {
                // ファイルが有ったよ だからセットするよ
                try {
                    // ファイルの中身のデータを入れるよ
                    FileBean fileBean = new FileBean();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file),"SJIS"));
                    // 挿入用変数
                    String line;
                    while((line = reader.readLine()) != null) {
                        // 一行ずつ入れるよ
                        fileBean.setList(new ArrayList<String>(Arrays.asList(line.split(","))));
                    }
                    // リーダーを閉じるよ
                    reader.close();

                    // リストをセットしておくよ
                    req.setAttribute("file", fileBean.getList());
                    // 飛ぶよ
                    req.getRequestDispatcher("/fileOut.jsp").forward(req, res);
                }catch (FileNotFoundException e) {
                    // ファイルが無かったよ
                    req.getRequestDispatcher("/fileSet.jsp").forward(req, res);
                }
            }
        } else {
            // ログインできてないから戻すよ
            req.setAttribute("rog", "ログインしてください");
            req.getRequestDispatcher("/rogin.jsp").forward(req, res);
        }
    }
}
