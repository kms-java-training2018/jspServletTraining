<%@page import="javafx.beans.binding.NumberExpression"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>名前と年齢入力</title>
</head>
<!-- 名前と年齢を入力するjsp -->
<body>
    <form action="/jspServletTraining/task1Init" method="post">
        <p>
            名前を入力してください <input type="text" name="name">
        </p>
        <p>
            年齢を入力してください <input type="text" name="age">
        </p>
        <input type="submit" value="送信">
    </form>
</body>
</html>