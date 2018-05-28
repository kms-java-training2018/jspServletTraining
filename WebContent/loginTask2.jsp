<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>あなたのIDとpassword</title>
</head>
<body>
	<form action="/jspServletTraining/login" method="POST">
		<p>IDを入力してください</p>
		<input type="text" name="ID">

		<p>passwordを入力してください</p>
		<input type="text" name="password">
		<p>
			<input type="submit" value="送信する">
	</form>
</body>
</html>