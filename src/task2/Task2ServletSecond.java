package task2;
/**
 * 課題2
 * 二つ目のサーブレット
 * sessionスコープのユーザIDとパスワードが正しいか確認しつつ、
 * ファイル指定画面からファイルの絶対パスを受け取り、
 * 内容をリストに格納して
 * 最終表示画面に送る
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Task2ServletSecond extends HttpServlet{
        protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
            request.setCharacterEncoding("UTF-8");
            response.setContentType("text/html; charset=UTF-8");

            //最初にセッションの確認

            //sessionスコープを使うための下準備
            HttpSession session = request.getSession();

            //ServletFirstでsessionスコープに入れた値が正しいか(入っているか)判断
            //まずはsessionスコープに入っている値を取得
            String userId = (String)session.getAttribute("userId");
            String password = (String)session.getAttribute("password");

            //sessionスコープに正しい値が入っていない場合はログインページに戻す
            if(!"ishikawa".equals(userId) || !"fukumi".equals(password)) {
                System.out.println("セッションがありません。");
                request.getRequestDispatcher("/task2Login.jsp").forward(request, response);
            }else {

            //task2SelectFileで指定されたファイルの絶対パスを受け取り、変数filepathに格納
            //(データの降り口)
            String filepath = request.getParameter("filepath");

            try {
                //Fileクラスのインスタンス作成
                File file = new File(filepath);

                //ファイルをオープンし、ファイルの中身を変数readerに格納する
                BufferedReader reader = new BufferedReader(new FileReader(file));

                //readerの中身をリストに入れていく
                    //変数lineを宣言
                    String line;
                    //リストのインスタンス確保
                    ArrayList<String>list = new ArrayList<String>();
                    //要素追加のループ
                    while((line= reader.readLine())!= null) {
                        list.add(line);
                    }

                //リストを変数contentsに格納
                ArrayList<String>contents = list;

                //リストに出力されたファイルの中身をrequestスコープで保存
                //contentsという名前をつける(データの乗り口)
                request.setAttribute("contents", contents);

                //ファイルを閉じる
                reader.close();

            //ファイルが見つからなかった場合などの例外処理
            }catch(FileNotFoundException e) {
                System.out.println(filepath + "が見つかりません。");
            }catch(IOException e) {
                System.out.println(e);
            }

            //task2Dispへフォワード
            request.getRequestDispatcher("/task2Disp.jsp").forward(request, response);
            }
        }




}
