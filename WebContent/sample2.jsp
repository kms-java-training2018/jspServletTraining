<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>あなたの名前と年齢と誕生月</title>
</head>
<body>
<form action="/jspServletTraining/sample2" method="POST">
<%!String name ="石川"; %><!-- 自分の名前 -->
<p>私の名前は
<br><%= name %>です
</p>
<p>お幾つですか</p>
<input type="text" name="age">歳
<p>
<p>誕生日は何月ですか</p>
<input type="text" name="month">月
<p>
<input type="submit" value="送信する">
</p>
</form>
</body>
</html>