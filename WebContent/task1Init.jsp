<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>あなたの名前と年齢</title>
</head>
<body>
<form action="/jspServletTraining/Task1Servlet" method="post">
<p>名前を入力してください。</p>
<input type = "text" name = "name">
<p>年齢を入力してください。</p>
<input type = "text" name = "age">
<br>
<br>
<input type="submit" value="送信する">
</form>
</body>
</html>