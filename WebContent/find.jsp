<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ファイル検索画面</title>
</head>
<body>
    <form action="/jspServletTraining/find" method="POST">

        <!-- 名前表示 -->
        <p>${id}様</p>

        <!-- ファイルがない場合表示 -->
        <p>${era}</p>

        <!-- ファイル名を入力させる -->
        <p>ファイル名を入力してください</p>
        <input type="text" name="find">
        <p>
            <input type="submit" value="送信する">
        </p>

    </form>

</body>
</html>