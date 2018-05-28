<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>課題２｜ファイルを指定</title>
</head>
<body>

<form action="/jspServletTraining/readFile" method="POST">

<h1>ファイルを指定してください。</h1>

<p>デスクトップ直下のファイル名</p>
<input type="text" name="fileName">
<p>
<input type="submit" value="ファイルを表示">

</form>


</body>
</html>