package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sample2Servlet extends HttpServlet{

	protected void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		String age = request.getParameter("age");
		String gender = request.getParameter("gender");
		String adult;

		int age1 = Integer.parseInt(age);

		if(age1 >= 20) {
			adult = "成人";
		}else {
			adult = "未成年";
		}


		if (gender.equals("男")) {
			gender = "male";
		}else if(gender.equals("女")) {
			gender = "famale";
		}else {
			gender = "性別不明";
		}


		request.setAttribute("age",age);
		request.setAttribute("gender",gender);
		request.setAttribute("adult",adult);


		request.getRequestDispatcher("sample2Disp.jsp").forward(request, response);
	}

	public static void main(String[] args) {

	}

}
