<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ファイルの指定</title>
</head>
<body>
<form action="/jspServletTraining/task2Reader" method="POST">
<p>ファイルの名前を入力してください</p>
<p>
<input type="text" name="filename" value="C:\\Users\\teranoshita-yuta\\newfile.csv">
</p>
<p>
<input type="submit" value="送信する">
</form>

</body>
</html>