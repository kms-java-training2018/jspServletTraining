<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ログイン情報</title>
<link rel="stylesheet" type="text/css" href="./main.css">
</head>
<body id="bgcolor">
    <script src="./test.js"></script>
    <form action="/jspServletTraining/login" method="Post">
        <div id="location">
            <h1>Login</h1>
            <p>IDを入力してください</p>
            UserID :<input type="text" name="userid" id="userId">
            <p>
            <p>パスワードを入力してください</p>
            Password :<input type="password" name="password" id="passWord">
            <p>
                <input type="submit" value="送信する" id="trueFalse">
        </div>
    </form>
</body>
</html>