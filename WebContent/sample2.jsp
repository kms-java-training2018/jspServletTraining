<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>あなたの名前と年齢</title>
</head>
<body>
    <form action="/jspServletTraining/sample2" method="POST">
        <%!String name = "花輪朋典";%><%-- 自分の名前 --%>
        <p>
            私の名前は <br><%=name%>です
        </p>
        <p>お幾つですか?</p>
        <input type="text" size="5" name="age">歳
        <p>誕生日はいつですか?</p>
        <input type="text" size="5" name="birthMonth">月<input type="text" size="5" name="birthDay">日
        <input type="submit" value="送信する">
    </form>
</body>
</html>