<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>課題２｜ログイン</title>
</head>
<body>

<form action="/jspServletTraining/login" method="POST">
<h1>ログイン情報を入力してください。</h1>
<p>ID(文字列)</p>
<input type="text" name="inputId">
<p>
<p>パスワード(文字列)</p>
<input type="text" name="inputPass">
<p>
<input type="submit" value="ログイン">

</form>

</body>
</html>