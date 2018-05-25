<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>File打ち込み</title>
</head>
<body>
	<form action="/jspServletTraining/file" method="POST">
		<p>File名を打ち込んでください</p>
		<input type="text" name="filename" value="C:\Users\hirachi-takahiro\Desktop\CSVFile.csv">
		 <input type="submit"value="送信する">
	</form>
</body>
</html>