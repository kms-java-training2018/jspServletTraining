<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>名前と年齢を入力</title>
</head>
<body>

<form action="/jspServletTraining/task1" method="POST">

<p>お名前をお教えいただけますか？</p>
<input type="text" name="nameInput">

<p>お幾つですか？</p>
<input type="text" name="ageInput">歳
<p>
<input type="submit" value="送信する">

</form>


</body>
</html>