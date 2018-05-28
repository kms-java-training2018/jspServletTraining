<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href= "./main.css" rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ログイン</title>
</head>
<body id ="main">
<form action="/jspServletTraining/login2Disp" method="POST">
<h1>ファイル選択</h1>
<div align="center"><br>ファイルを入力してください
<input type="text" name="file">

<p>${erMs}
</p>
 <input type="submit" value="送信する">
 </div>
</form>
</body>
</html>