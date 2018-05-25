<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ファイル認証</title>
<link rel="stylesheet" type="text/css" href="./main.css">
</head>
<body id="bgcolor">
    <form action="/jspServletTraining/fileread" method="Post">
        <div id="location">
            <h1>Welcome</h1>
            <p>ファイル名を入力してください</p>
            FileName :<input type="text" name="filename">
            <p>
                <input type="submit" value="送信する">
        </div>
    </form>
</body>
</html>