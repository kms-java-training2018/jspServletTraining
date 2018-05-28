<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>開くファイルを選んでください</title>
</head>
<body>
    <div align="right">
        <form action="/jspServletTraining/logout" method="post">
            ${id}さん : <input type="submit" value="ログアウト">
        </form>
    </div>
    <p>
        デスクトップ上のCSVファイルを読み込みます<br> <font color="#ff0000">${comment}</font>
    <form action="/jspServletTraining/fileOpen" method="post">
        <p>
            File:<input type="text" name="file"> <input type="submit"
                value="OK">
        </p>

        <input type="hidden" value="${ok}" name="ok">

    </form>
</body>
</html>