package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.NewEmployeeBean;

public class BeanSampleServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		//Beanの生成とフィールドへのアクセス
		NewEmployeeBean bean = new NewEmployeeBean();
		bean.setName("三野進紀");
		bean.setEmployeeNumber(111);

		//リクエストスコープにアクセス
		req.setAttribute("bean", bean);

		req.getRequestDispatcher("/beanSample.jsp").forward(req, res);
	}

}
