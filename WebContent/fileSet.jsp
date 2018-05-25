<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ファイルをセットします</title>
</head>
<body>
<!-- ファイル名を入力してもらって -->
<!-- それが合ったら表示するところまで飛ぶよ -->
<form action="/jspServletTraining/file" method="POST">
<p>見たいファイル名を入力してください</p>
<input type="text" name="fileName">
<p><font color="red">${notFile}</font></p>
<input type="submit" value="決定">
</form>
<p>
<!-- ログアウト用の -->
<!-- 文字だよ -->
<form action="/jspServletTraining/rogout" method="POST" name="form1">
<input type="hidden" name="user_name" value="名前">
<div align="right">
<a href="javascript:form1.submit()" >
ログアウト
</a>
</div>
</form>
</body>
</html>