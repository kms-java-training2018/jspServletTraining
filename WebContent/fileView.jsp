<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@
page import ="java.util.ArrayList"
%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="/jspServletTraining/postscript" method="POST">
<p>データを入力</p>
<input type="text" name ="newData">
<p>
<input type="submit" value="上の入力をファイルに追記">
</form>

<% request.setCharacterEncoding("Windows-31J"); %>
<p>ファイルの表示

<table border="1">
<tr>
<th>データ一覧</th>
</tr>


<c:forEach var="obj" items="${list}" varStatus="status">
<tr>
<td><c:out value="${obj}"/></td>
</tr>
</c:forEach>

</table>



</body>
</html>