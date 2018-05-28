<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ログイン後</title>
</head>
<body>
    <h1>ファイルを指定してください</h1>
    <form action="/jspServletTraining/loginFileDisp" method="POST">
        <p>
        <br>${sessionName}
        </p>
        <p>
        <%String csv = ""; %>
            ファイル名を入力<br>
            例)C:\Users\inada-yuji\Desktop\CSVFile.csv<br>
            <input type="text" name="csv">
        </p>
        <p>
            <input type="submit" value="指定">
    </form>
</body>
</html>