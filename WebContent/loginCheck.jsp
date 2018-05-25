<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ログインページ</title>
</head>
<link rel="stylesheet" type="text/css" href="C:\Users\takatsuka-akihito\Desktop\研修関連\高塚昭人\css\main.css">
<body id = bgcolor1>
    <form action="/jspServletTraining/loginCheck" method="POST">
        <h1>ログインページ</h1>
        <br>
        <p>IDを入力してください</p>
        <br> <input type="text" name="id">
        <p>
        <p>パスワードを入力してください</p>
        <br> <input type="text" name="pw">
        <p>
            <input type="submit" value="送信する">
        </p>
    </form>
</body>
</html>