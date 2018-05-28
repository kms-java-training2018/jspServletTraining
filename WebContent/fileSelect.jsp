<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.io.File"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@
page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>FileSelect</title>
</head>
<body>
	<form action="/jspServletTraining/fileread" method="POST">
		<p>
			表示したいファイル名を入力 <input type="text" name="name">
		<p>
			<input type="submit" value="ファイル内容取得">

		<p>ファイル一覧の表示
		<p>

<c:forEach var="obj" items="${fileList}" varStatus="status">
<c:out value="${obj}"/><br>
</c:forEach>

	</form>
</body>
</html>