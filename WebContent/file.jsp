<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ファイルの読み込み</title>
</head>
<body>

	<c:if test="${true != null}" var="flg" />
	<c:if test="${flg}">
		<p>
			ログインしました<br>
		</p>
		<form action="/jspServletTraining/file" method="POST">
			<p>ファイルの入力</p>
			<input type="text" name="filename">

			<p>
				<input type="submit" value="送信">
			</p>
		</form>
	</c:if>

	<c:if test="${!flg}">
		<p>セッションがありません</p>
		<br>
		<a href="./getLogin.jsp"> 戻る </a>

	</c:if>
	<form action="/jspServletTraining/logout" method="POST">
			
			<p>
				<input type="submit" value="ログアウト">
			</p>
		</form>
</body>
</html>