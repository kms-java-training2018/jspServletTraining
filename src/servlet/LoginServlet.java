package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

	//private static final Object ID = null;
	//private Object password;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html); charset=UTF-8");

		String ID = request.getParameter("ID");
		String password = request.getParameter("password");
		// ID,passwordを設定
		String user = "hirachi";
		String pass = "0308";

		if (ID.equals(user) && password.equals(pass)) {

			HttpSession session = request.getSession(true);

			session.setAttribute("ID", ID);
			session.setAttribute("password", password);

			request.getRequestDispatcher("/fileInitTask2.jsp").forward(request, response);

		} else {

			request.setAttribute("ID", ID);
			request.setAttribute("password", password);

			request.getRequestDispatcher("/loginTask2.jsp").forward(request, response);

		}
	}
}