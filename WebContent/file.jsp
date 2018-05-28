<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="./file.css" rel="stylesheet" type="text/css">
<link href="./main.css" rel="stylesheet" type="text/css">
</head>
<body id="main">
<form action="/jspServletTraining/File" method="POST">
<p>ファイル指定</p>
<input type="text" name="fileName"><br>
<input type="submit" value="表示">
<p>
<div id="sh">
${ fileMsg }
</div>
</p>
</form>
</body>
</html>