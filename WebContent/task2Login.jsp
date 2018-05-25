<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ログイン画面</title>
</head>
<body>
    <form action="/jspServletTraining/task2Login" method="POST">
        <p>社員番号を入力してください</p>
        <p>
            <input type="text" name="id">
        </p>
        <p>4桁のパスワードを入力してください</p>
        <input type="text" name="pass">
        <p>
            <input type="submit" value="送信する">
        </p>
    </form>

</body>
</html>