<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>読み取るファイルを選択します</title>
<!-- cssのスタイルシートと同期 -->
    <link href="/jspServletTraining/css/Task2.css" rel="stylesheet" type="text/css" media="all">
</head>
<body>
<div align="center" class="bgcolor">
<form action="/jspServletTraining/task2Second" method="POST">
<p>読み取るファイルの絶対パスを入力してください</p>
<br>
<p>ファイルの絶対パスは、ファイルのプロパティから確認できます。</p>
<p>ファイルの絶対パス</p>
<input type="text" name="filepath">
<p>
<input type="submit" value="送信">
</p>
</form>
</div>
</body>
</html>