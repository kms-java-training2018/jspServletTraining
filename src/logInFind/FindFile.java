package logInFind;

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

public class FindFile extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        // セッションの情報取得
        HttpSession session = request.getSession(true);

        // 入力されたファイル名を取得
        String find = request.getParameter("find");

        // セッション内に値があるか確認する
        if (session.getAttribute("logIn") == null) {
            // なければ、ログイン画面に戻る
            request.getRequestDispatcher("/logIn.jsp").forward(request, response);

        } else {
            try {
                // 入力されたファイル名をもとにのパスを取得する
                File file = new File("C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\" + find);

                // ファイルが存在しない場合エラーをしめし、検索画面に戻る
                if (!file.exists()) {
                    request.setAttribute("era", "ファイルが存在しません");
                    request.getRequestDispatcher("/find.jsp").forward(request, response);
                }

                // FileReaderクラスのインスタンス取得
                FileReader fileReader = new FileReader(file);
                // BufferedReaderクラスのインスタンス取得
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                // ファイルの中身を格納する変数とリストを作る
                String date;
                ArrayList<String> list = new ArrayList<String>();

                // ファイルの中身をすべて読み出すまで処理を続ける
                while ((date = bufferedReader.readLine()) != null) {
                    // リストに格納
                    list.add(date);
                }

                // リストの値をリクエストスコープヘ入れる
                request.setAttribute("list", list);

                // 最後にファイルを閉じてリソースを開放する
                fileReader.close();

                // 結果画面に処理を移行
                request.getRequestDispatcher("/result.jsp").forward(request, response);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}