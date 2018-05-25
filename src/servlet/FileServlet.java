package servlet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FileServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html); charset=UTF-8");

		String filename = request.getParameter("filename");

		// セッションの保持を確認
		HttpSession sessionname = request.getSession();
		if (sessionname.getAttribute("ID") == null || sessionname.getAttribute("password") == null) {
			request.getRequestDispatcher("/loginTask2.jsp").forward(request, response);
		}
		// 1.ファイルのパスを指定する
		File file = new File(filename);

		// 2.ファイルが存在しない場合に例外が発生するので確認する
		if (!file.exists()) {
			System.out.print("ファイルが存在しません");
			return;
		}

		// 3.FileReaderクラスとreadメソッドを使って1文字ずつ読み込み表示する
		FileReader fileReader = new FileReader(file);

		BufferedReader reader = new BufferedReader(fileReader);
		String line = reader.readLine();
		System.out.println(line);
		reader.close();

		request.setAttribute("filename", filename);
		request.setAttribute("file", file);
		request.setAttribute("line", line);
		String id = "iyo";
		request.setAttribute("ID", id);

		request.getRequestDispatcher("/dispTask2.jsp").forward(request, response);
	}
}