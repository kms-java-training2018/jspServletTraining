<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ログイン情報入力</title>
</head>
<body>
    <form action="/jspServletTraining/logIn" method="POST">
        <%!String id = "";%><!-- ユーザーID入力 -->
        <p>
            ユーザーIDを入力してください <br>
        </p>
        <input type="text" name="id">
        <p>
            <%!String password = "";%><!-- パスワード入力 -->
        <p>
            パスワードを入力してください <br>
        </p>
        <input type="text" name="password">
        <p>
            <input type="submit" value="ログイン">
            <br> <a
                href="https://mail.kyms.co.jp/community/"> K+ ZOOぷすっログイン</a>
    </form>

</body>
</html>