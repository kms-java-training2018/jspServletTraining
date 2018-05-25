package servlet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginSampleServlet1 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        String filename = request.getParameter("file");

        //セッションの設定
        HttpSession session = request.getSession();
        String id = (String) session.getAttribute("id");

        String tmout = "セッションが切れました";
        if (id == null) {
            request.setAttribute("tmout", tmout);
            request.getRequestDispatcher("/loginInit.jsp").forward(request, response);
            return;
        }

        // 1.ファイルのパスを指定する
        File file = new File(filename);

        // 2.ファイルが存在しない場合に例外が発生するので確認する
        String erMs = "ファイルが存在しません";
        if (!file.exists()) {
            System.out.print("ファイルが存在しません");
            request.setAttribute("erMs", erMs);
            request.getRequestDispatcher("/login1Disp.jsp").forward(request, response);
            return;
        }

        // 3.FileReaderクラスとreadメソッドを使って1文字ずつ読み込み表示する
        FileReader fileReader = new FileReader(file);

        BufferedReader br = new BufferedReader(fileReader);
        String line = br.readLine();
        System.out.println(line);

        request.setAttribute("line", line);
        request.getRequestDispatcher("/fileDisp.jsp").forward(request, response);
    }
}
