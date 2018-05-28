<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ホームページ</title>
</head>
<body>
<form action="/jspServletTraining/fileDes" method="POST">
    <p>
        ようこそ
    </p>
    どのファイルを参照しますか
    <br> <input type="text" name="filename" value="C:\Users\takatsuka-akihito\Desktop\研修関連\無題111.txt">
    <br>
    <input type="submit" value="次へ">
    </form>
    <br>
    <%String[] subjects = {"0","1","2","3", "4", "5", "6", "7", "8", "9", "10", "999"}; %>
    <select>
<%for(int i = 0; i < subjects.length ; i++){ %>
    <option value="<%= i %>"><%= subjects [i] %></option>
<%} %>
</select>
</body>
</html>