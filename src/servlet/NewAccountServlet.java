package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.NewAccount;

public class NewAccountServlet extends HttpServlet{


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {


		req.setCharacterEncoding("UTF-8");
		res.setContentType("text/html;charset=UTF-8");


		//新規登録で取得したデータを変数に代入
		String newName = req.getParameter("newName");
		String newPass = req.getParameter("newPass");

		//newAccount.beanで新規登録
		NewAccount na = new NewAccount();
		na.setName(newName);
		na.setPass(newPass);




	}
	}
