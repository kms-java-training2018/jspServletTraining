<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>データ表示</title>
</head>
<body>
<!-- ファイルの中身を表示するよ -->
<!-- 一番上の行だけ色を変えるよ -->
<!-- それ以外は普通だよ -->
<p>ファイルの中身です</p>
<table border="1">
    <tr bgcolor="#88ee00" align="center">
        <c:forEach var="list" items="${file.get(0)}" varStatus="status">
            <td>${list}</td>
        </c:forEach>
    </tr>
<c:forEach var="i" items="${file}" varStatus="status" begin="1">
    <tr align="center">
        <c:forEach var="j" items="${i}" varStatus="status">
            <td>${j}</td>
        </c:forEach>
    </tr>
</c:forEach>
</table>
<p>
<!-- フォルダ選択に戻るための文字だよ -->
<a href="http://localhost:8080/jspServletTraining/fileSet.jsp">
フォルダ選択に戻る
</a>
<!-- ログアウト用の文字だよ -->
<p>
</p>
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