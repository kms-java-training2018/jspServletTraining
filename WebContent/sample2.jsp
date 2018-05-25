<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>あなたの名前と年齢</title>
</head>
<body>
<form action="/jspServletTraining/sample2" method="post">
<%!String name = "山岸瞳子"; %>
<p>私の名前は
<br><%= name %>です
</p>
<p>お幾つですか</p>
<input type="text" name="age">歳
<p>
<input type="submit" value="送信する">
</form>
</body>
</html>