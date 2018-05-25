<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新規登録</title>
</head>
<body>
<!-- ログイン情報入力の後移動 -->
<!-- ログインできなければ戻ってくる -->
<form action="/jspServletTraining/newRogin" method="POST">
<p>新規登録情報を入力してください</p>
<!-- そのパスワードが使われていたか -->
<p><font color="red">${notPass}</font></p>
<!-- パスワード確認用 -->
<p>パスワード
<input type="password" name="pass">
<!-- ID確認用 -->
<p>ID
<input type="text" name="id">
<p>
<input type="submit" value="新規登録">
<p>
</form>
</body>
</html>