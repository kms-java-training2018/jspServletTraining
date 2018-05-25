package servlet;

/**
 * ログイン処理を行うServlet
 * ID指定は無いが、パスワードは「1111」に設定。
 * パスワードに「1111」が入力されていれば
 * ファイルを指定させるjspへ、
 * それ以外を入力した場合ログイン画面に戻す。
 * */
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Task2LoginBean;

public class Task2LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		//文字コード設定
		req.setCharacterEncoding("UTF-8");
		res.setContentType("text/html; charset=UTF-8");
		//sessionの開始
		HttpSession session = req.getSession(true);
		//loginBeanを設定
		Task2LoginBean loginBean = new Task2LoginBean();
		if (req.getParameter("loginId") != null) {
			//loginBeanのsetLoginIdを"loginId"という名前で受け取った引数で実行
			loginBean.setLoginId((String) req.getParameter("loginId"));
		} else {
			req.getRequestDispatcher("/task2Login.jsp").forward(req, res);
		}
		//passwordをint型に変更
		int password = Integer.parseInt(req.getParameter("password"));
		/*
		 * password判定
		 * 1111であれば、task2FileSelect.jspへ、
		 * それ以外の場合は元のログイン画面に移動させる。
		 * */
		if (password == (int) 1111) {
			session.setAttribute("loginBean", loginBean);
			//sessionScopeにloginBeanという変数（ピンク）を"loginBean"（青）という名前で送る。
			req.getRequestDispatcher("/task2FileSelect.jsp").forward(req, res);
		} else {
			req.getRequestDispatcher("/task2Login.jsp").forward(req, res);
		}
	}
}
