package loginFile;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogOutServlet extends HttpServlet {
	/**
	 * ログアウト用のサーブレット
	*/
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// セッション破棄
		HttpSession session = request.getSession(false);
		if (session != null) {
			session.invalidate();
		}
		// ログイン画面に戻る
		request.getRequestDispatcher("/login.jsp").forward(request, response);
	}

}
