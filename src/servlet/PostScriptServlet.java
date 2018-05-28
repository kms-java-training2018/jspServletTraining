package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.FileView;
import bean.PostScript;

public class PostScriptServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8");
		res.setContentType("text/html;charset=UTF-8");

		HttpSession session = req.getSession();

		/* 認証失敗から呼び出されたのかどうか */
		String status = (String)session.getAttribute("login");

		if (status.equals("ok")) {

		//新規登録で取得したデータを変数に代入
		String newData = req.getParameter("newData");


		//sessionからファイル名を取り出し、
		PostScript na = new PostScript();

		String name = (String) session.getAttribute("fileName");
		na.setFileName(name);

		//PostScriptでデータを追記

		na.setData(newData);

		//FileViewを使ってファイル名nameを設定
		FileView view = new FileView();
		view.setPath(name);

		//ArrayListを設定
		ArrayList<String> list = new ArrayList<String>();
		list = view.getPath();

		//FileViewをreqに持たせて送信
		req.setAttribute("list", list);
		session.setAttribute("fileName", name);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/fileView.jsp");
		dispatcher.forward(req, res);

		} else {
			// ログインフォームへ移動.

			RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
			dispatcher.forward(req, res);


		}

	}

}
