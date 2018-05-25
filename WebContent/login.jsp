<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>

<body>
<form action="/jspServletTraining/login" method="POST">
<p>Username</p>
<input type="text" name ="name">
<p>Password</p>
<input type="text" name ="pass">
<p>
<p>
<input type="submit" value="送信する">
</p>
</form>
<form action="/jspServletTraining/newAccount.jsp">
<button>
新規登録※未実装
</button>
</form>
</body>
</html>