<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>年齢を表示します</title>
</head>
<body>
<form action="/jspServletTraining/sample2" method="POST">
<p>私の年齢は
<br>${age}です
<p>私の趣味は
<br>${hobby}です
<p>チェックボックスは
<br>${bool}です
<p>ボタンは
<br>${button}です
</p>
<input type="text" name="age">歳
<p>趣味は何ですか</p>
<input type="text" name="hobby" value="ビリヤード">
<p>
<input type="submit" value="送信する">
<p>
<input type="password" name="pass" value="pass">
<p>
<input type="button" name="button" value="button">
<p>
<input type="checkbox" name="bool">
<p>
<input type="image">
</form>
</body>
</html>