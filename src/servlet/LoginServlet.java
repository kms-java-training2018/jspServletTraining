package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.FileList;

public class LoginServlet extends HttpServlet {

	private static final String UserName = "yasumasa";
	private static final String PassWord = "abc";

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {


		req.setCharacterEncoding("UTF-8");
		res.setContentType("text/html;charset=UTF-8");

		//ユーザーネームを取得
		String name = req.getParameter("name");
		if (null == name) {
			name = "";
		}
		//パスワードを取得
		String pass = req.getParameter("pass");
		if (null == pass) {
			pass = "";
		}

		/**ユーザー名とパスワード保存した
		LoginCollation lc = new LoginCollation();
		lc.setName(name);
		lc.setPassword(pass);

		name = lc.getName();
		pass = lc.getPassword();
*/
		//セッション
		HttpSession session = req.getSession();

		//ユーザー名とパスワードの照合
		if (UserName.equals(name) && PassWord.equals(pass)) {
			// ファイル参照へ移動.


			//FileListを使ってFileListを読み込む

			FileList fl = new FileList();

			ArrayList<String> fileList = new ArrayList<String>();
			ArrayList<String> dirList = new ArrayList<String>();
			fileList = fl.getFileList();

			dirList = fl.getDirList();

			//FileListをreqに持たせて送信
			req.setAttribute("fileList", fileList);

			//dirListをreqに持たせて送信
			req.setAttribute("dirList", dirList);

			//session.setMaxInactiveInterval(5);

			// セッションにログインOKを設定しページ遷移
			session.setAttribute("login", "ok");
			RequestDispatcher dispatcher = req.getRequestDispatcher("/fileSelect.jsp");
	        dispatcher.forward(req, res);


		} else {
			// ログインフォームへ移動.

			RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
			dispatcher.forward(req, res);


		}






	}
}
