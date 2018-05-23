<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>課題1</title>
</head>
<body>
    <form action="/jspServletTraining/task1Init" method="POST">
        <%!String name = "";%><!-- 自分の名前 -->
        <p>
            名前を入力してください <br> <input type="text" name="name">さん
        <p>


            <%!String old = "";%><!-- 自分の年齢 -->
        <p>
            年齢を入力してください <br> <input type="text" name="old">歳
        <p>
            <input type="submit" value="送信する">
    </form>
</body>
</html>