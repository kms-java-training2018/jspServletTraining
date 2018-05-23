<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>課題1 名前と年齢</title>
</head>
<body>
	<form action="/jspServletTraining/task1" method="POST">
		<!-- 	名前をuserNameに、年齢をageにいれる。 -->
		<p>お名前は？</p>
		<input type="text" name="userName">
		<p>お幾つですか？</p>
		<input type="text" name="age">歳
		<p>
			<input type="submit" value="送信する">
		</p>
	</form>
</body>
</html>