<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>名前と年齢</title>
</head>
<body>
    <form action="/jspServletTraining/task1" method="POST">
        <p>あなたの名前を教えてください</p>
        名前:<input type="text" name="myName"> <br>
        <p>あなたの年齢を教えてください</p>
        <input type="text" name="age">歳
        <p>
            <input type="submit" value="送信する">
        </p>
    </form>
</body>
</html>