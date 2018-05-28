<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>マイページ</title>
</head>
<body>
    <form action="/jspServletTraining/logIn2" method="POST">
        <p>ようこそ ${id}さん</p>
        <br>
        <%!String csv = "";%><!-- ユーザーID入力 -->
        <p>
            表示するcsvファイル名を絶対パスで入力してください <br>
        </p>
        <br>
        <p>例）C:\Users\goto-kazuki\Desktop\jsp.csv</p>
        <input type="text" name="csv">
        <p>
            <input type="submit" value="表示">
    </form>
</body>
</html>