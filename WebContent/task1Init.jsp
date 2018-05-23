<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <form action="/jspServletTraining/task1Init" method="POST">

        <%
            String name = "";
        %>
        <p>
            私の名前は <br>
            <input type="text" name="name">です

        </p>

        <p>年齢は</p>
        <input type="text" name="age">歳
        <p>
            <input type="submit" value="送信する">
    </form>
</body>
</html>