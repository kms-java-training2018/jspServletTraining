package servlet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FileReadServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		HttpSession session = request.getSession(true);

		//セッションが開始されたいたら処理を開始
		if (session != null) {

			String fr = request.getParameter("filename");
			File file = new File(fr);

			//ファイルが存在するか確認する
			if (file.exists()) {
				BufferedReader reader = new BufferedReader(new FileReader(file));
				String line = "";
				ArrayList<String> list = new ArrayList<String>();
				while ((line = reader.readLine()) != null) {

					list.add(line);

				}
				reader.close();
				request.setAttribute("list", list);

				request.getRequestDispatcher("/fileDisp.jsp").forward(request, response);

				//ファイルがなかった場合fileNotFoundに飛ぶ
			} else {
				request.getRequestDispatcher("/fileNotFound.jsp").forward(request, response);

				//セッションがなかった場合sessionOutに飛ぶ
			}
		}
	}
}
