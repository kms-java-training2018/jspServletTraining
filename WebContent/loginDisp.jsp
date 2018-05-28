<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>入力処理</title>
</head>
<body>

    <form action="/servlet/login" method="POST">

        <p>
            ユーザー名は <br>${name}
        </p>

        <p>
            パスワードは <br>${pass}
        </p>
    </form>

</body>
</html>