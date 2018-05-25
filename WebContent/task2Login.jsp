<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ログイン</title>
<!-- cssのスタイルシートと同期 -->
    <link href="/jspServletTraining/css/Task2.css" rel="stylesheet" type="text/css" media="all">
</head>
<body>
<div align="center" class="bgcolor">
<form action="/jspServletTraining/task2First" method="POST">
<p>ユーザIDとパスワードを入力してください</p>
<br>
<p>ユーザID</p>
<input type="text" name="userId">
<p>
<p>パスワード</p>
<input type="text" name="password">
<p>
<input type="submit" value="ログイン">
</p>
</form>
</div>
</body>
</html>