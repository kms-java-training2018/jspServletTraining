<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>名前と年齢を教えて</title>
</head>
<body>
<form action="/jspServletTraining/task1Init"method="post">
<p>名前を教えてください</p>
<input type="text"name="name">
<p>お幾つですか</p>
<input type="text"name="age">歳
<p>
<input type="submit"value="送信する">
</form>
</body>
</html>