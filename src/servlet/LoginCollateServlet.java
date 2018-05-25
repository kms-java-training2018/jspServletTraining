package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.IdPassBean;

public class LoginCollateServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		HttpSession session = request.getSession(false);
		//Beanの生成
		IdPassBean bean = new IdPassBean();

		bean.setId("1");
		bean.setPass("mitsuno");

		String id = request.getParameter("id");
		String pass = request.getParameter("pass");

		if (bean.getId().equals(id) && bean.getPass().equals(pass)) {
			request.setAttribute("id", id);
			request.setAttribute("pass", pass);
			session = request.getSession(true);

			session.setAttribute("true", "true");

			request.getRequestDispatcher("/file.jsp").forward(request, response);
		} else {

			request.getRequestDispatcher("/loginError.jsp").forward(request, response);
		}

	}

}
