<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ファイルの出力</title>
</head>
<body>
	<p>
		<c:forEach var="x" items="${list}">
			${x}
			<br>
		</c:forEach>
	</p>
	<form action="/jspServletTraining/logout" method="POST">

		<p>
			<input type="submit" value="ログアウト">
		</p>
	</form>

</body>
</html>