<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ログインページ</title>
<link rel="stylesheet" type="text/css" href="./main.css">
</head>
<body id="bgcolor">
    <script src="./jquery-3.3.1.min.js">

    </script>
    <script src="./tero.js">

    </script>
    <div id="main">
    <h1>ログイン</h1>
    <form action="/jspServletTraining/login" method="Post">
    <p>ユーザーIDを入力してください</p>
        ユーザーID:<input type="text" name="user">
        <br><p>パスワードを入力してください</p>
        パスワード:<input type="password" name="password"> <br><br>
        <input type="submit" value="ろぐいん">
    <br><br><br><input type="button" value="会員登録" id="button1">

    </form>
    </div>
</body>
</html>