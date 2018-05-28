<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>参照ページ</title>
</head>
<body>

    <%// 現在の時刻を取得
        java.util.Date nowTime = new java.util.Date();
    %>
    現在の時刻は
    <strong><%=nowTime%></strong> です。

    <p>${file2}</p>



</body>
</html>