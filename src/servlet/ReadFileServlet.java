package servlet;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ReadFileServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        // リクエストからセッションを取得
        HttpSession session = request.getSession();

        // パラメーターの値(入力されたファイル名)を取得
        String fileName = request.getParameter("fileName");

        // ファイル名が入力されなかった場合、ファイル名指定ページに戻る
        if (fileName == null) {
            request.getRequestDispatcher("/task2SelectFile.jsp").forward(request, response);
        }

        // ログインが完了していない場合、ログイン画面に戻る
        if (session.getAttribute("login_user") == null ) {
            request.getRequestDispatcher("/task2Login.jsp").forward(request, response);
        }

        // ファイルの読み込み
        try {
            // ファイル名からファイルの絶対パスを設定
            String file = "C:/Users/" + System.getProperty("user.name") + "/Desktop/" + fileName;
            // ファイル読み込みの準備
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            // ファイルの行を要素とし、リストに追加
            ArrayList<String> fileContent = new ArrayList<String>();
            while ((line = reader.readLine()) != null) {
                fileContent.add(line);
            }
            reader.close();

            // jspファイルに送る
            request.setAttribute("fileContent", fileContent);
            request.setAttribute("fileName", fileName);
            request.getRequestDispatcher("/task2DispFile.jsp").forward(request, response);

        // 以下例外処理。ファイル選択画面に戻る。
        } catch (FileNotFoundException e) {
            request.getRequestDispatcher("/task2SelectFile.jsp").forward(request, response);
            System.out.println("指定されたファイルが見つかりません。"); // コンソールに表示
        } catch (IOException e) {
            request.getRequestDispatcher("/task2SelectFile.jsp").forward(request, response);
            System.out.println("例外発生"); // コンソールに表示
        }

    }
}
