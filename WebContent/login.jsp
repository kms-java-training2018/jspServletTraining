<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login jsp</title>
</head>
<body>
<h1>Login</h1>

    <form action="/jspServletTraining/login" method="POST">
        <p>
            ユーザー名を入力 <br> <input type="text" name="name">
        </p>

        <p>パスワード入力</p>
        <input type="text" name="pass">

        <p>
            <input type="submit" value="送信する">
            <input type="reset" value="やり直し">
    </form>

</body>
</html>