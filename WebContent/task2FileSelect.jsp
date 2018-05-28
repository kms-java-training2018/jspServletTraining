<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ファイル選択</title>
</head>
<body>
	<form action="/jspServletTraining/task2FileCheck" method="POST">
		<p>ようこそ</p>
		<p>
			お疲れ様です、 <br>${sessionScope.loginBean.loginId}さん。
			<%--{スコープ.Servletで設定したBeanの変数名.Bean内の変数名} --%>
		</p>
		<p>読み込むファイルのパスを入れてください。</p>
		<input type="text" name="pass">
		<p>
			<input type="submit" value="送信する">
		</p>
	</form>
</body>
</html>