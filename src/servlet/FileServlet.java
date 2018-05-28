package servlet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FileServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        HttpSession session = request.getSession();
        int intervalTime = session.getMaxInactiveInterval();
        /**
         * sessionの中身(Login.Servlet.javaでid, passwordを渡している)がある場合
         *  →ファイルを読み込む処理に入る
         */
        if(session != null) {

            /**
             * ①file.jspから受け取った"fileName"をString型の変数fileNameに代入
             * ②String型の変数fileNameをint型の変数nに代入
             * ③各ファイルで参照した値を入れるString型の変数lineを宣言
             * ④変数lineに入れられた値を保持しておくためのString型のlistを作成
             */
            String fileName = request.getParameter("fileName");
            int n = Integer.parseInt(fileName);
            String line = "";
            ArrayList<String> list = new ArrayList<String>();

            /**
             * fileNameに入力があった場合→該当ファイルを読み込む
             */
            if (request.getParameter("fileName") != null) {
                switch(n) {
                /**
                 * テキストボックスで"1"が選択された場合
                 *  →minions.csvを1行ずつ参照し、
                 *    参照した値をlistに追加する。
                 */
                case 1:
                    try{
                        BufferedReader reader = new BufferedReader(new FileReader
                                ("C:\\Users\\yamagishi-toko\\Desktop\\minions.csv"));

                        while ((line = reader.readLine()) != null) {
                            if (!list.contains(line)) {
                                list.add(line);
                            }
                        }
                        reader.close();
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                    break;
                    /**
                     * テキストボックスで"2"が選択された場合
                     *  →spongebob.csvを1行ずつ参照し、
                     *    参照した値をlistに追加する。
                     */
                case 2:
                    try{
                        BufferedReader reader = new BufferedReader(new FileReader
                                ("C:\\Users\\yamagishi-toko\\Desktop\\spongebob.csv"));

                        while ((line = reader.readLine()) != null) {
                            if (!list.contains(line)) {
                                list.add(line);
                            }
                        }
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                    break;
                    /**
                     * テキストボックスで何も選択されていない場合
                     * テキストボックスで"1", "2"以外が入力された場合
                     */
                default:
                }

            } else {
                /**
                 * sessionが切れた場合→ログイン画面(login.jsp)へ戻る
                 */
                request.getRequestDispatcher("/login.jsp").forward(request, response);
            }

            /**
             * lineで読み込んだ内容を"fileName"に入れて、
             * "/fileDisp.jsp"にフォワードする
             */
            request.setAttribute("fileName", list );
            request.getRequestDispatcher("/fileDisp.jsp").forward(request, response);
        }
    }
}
