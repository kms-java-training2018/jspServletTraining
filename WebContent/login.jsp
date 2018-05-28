<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="./main.css" rel="stylesheet" type="text/css">
</head>
<body id="main">
    <form action="/jspServletTraining/File1" method="POST">
            <div id="aiueo">
            ユーザーID<br>
            <input type="text" name="loginID"><br><br>
            パスワード<br>
            <input type="password" name="loginPW" id="aiueo"><br><br>
            <input type="submit" value="ログイン" id="aiueo"><br><br>
            <font color="red"><strong>${pwMsg}</strong></font>
            <font color="red"><strong>${sessionMsg}</strong></font>
            </div>
    </form>
</body>
</html>