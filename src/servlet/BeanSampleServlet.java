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
		//Beanの作成とフィールドへのアクセス
		NewEmployeeBean bean = new NewEmployeeBean();
		bean.setName("飯島直幸"); //beanのsetNameを"飯島直幸"という引数で実行
		bean.setEmployeeNumber(543); //beanのsetEmployeeNumberを543という引数で実行

		//リクエストスコープにアクセス
		req.setAttribute("bean", bean);

		req.getRequestDispatcher("/beanSample.jsp").forward(req, res);
	}
}
