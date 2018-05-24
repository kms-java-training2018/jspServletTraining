package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Task1Servlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		/*
		 * task1Initで渡されたuserNameとageを受け取る。
		 * Servlet内のuserName,ageに代入。
		 * */
		String userName = request.getParameter("userName");
		String age = request.getParameter("age");
		request.setAttribute("userName", userName);
		request.setAttribute("age", age);
		/*
		 * task1Disp.jspにそれぞれの値を渡す。
		 * */
		request.getRequestDispatcher("/task1Disp.jsp").forward(request, response);
	}
}
