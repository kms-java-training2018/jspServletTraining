<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"  content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./CSS/main.css">
<title>ログイン</title>
</head>
<body id="page">
    <div class="page">
        <p class="midashi">◇ログイン◇</p>
        <font color="#ff0000">${comment}</font> IDとパスワードを入力してください <br>
        <form action="/jspServletTraining/login" method="post">
            <p>
                ID:<input type="text" name="id">
            <p>
                PASS:<input type="password" name="pass">
            <p>
                <input type="submit" value="OK">
            </p>
        </form>
    </div>
</body>
</html>