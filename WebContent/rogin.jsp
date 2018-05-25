<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ログイン画面</title>
</head>
<body>
<!-- ログイン情報入力の後移動 -->
<!-- ログインできなければ戻ってくる -->
<form action="/jspServletTraining/rogin" method="POST">
<p>ログイン情報を入力してください</p>
<!-- パスワード確認用 -->
<p>パスワード
<input type="password" name="pass">
<!-- ID確認用 -->
<p>ID
<input type="text" name="id">
<!-- ログインできたかどうか確認用表示 -->
<p><font color="red">${rog}</font></p>
<input type="submit" value="ログイン">
<p>
</form>
<form action="/jspServletTraining/newRogin.jsp">
<button>
新規登録
</button>
</form>
<!-- ログアウト用文字 -->
<!-- クリックするとログアウトする -->
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