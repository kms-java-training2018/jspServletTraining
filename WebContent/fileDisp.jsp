<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ファイルを展開しました</title>
</head>
<body>
    <div align="right">
        <form action="/jspServletTraining/logout" method="post">
            ${id}さん : <input type="submit" value="ログアウト">
        </form>
    </div>
    <p>
        展開成功です <form action="/jspServletTraining/back" method="post">
        <input type="hidden" value="${ok}" name="ok">
        <input type="submit" value="戻る">
    </form>
        <br>
    <table border="1">
        <c:forEach items="${data}" var="i">
            <tr>
                <c:forEach items="${i}" var="j">
                    <td>${j}</td>
                </c:forEach>
            </tr>
        </c:forEach>
    </table>
</body>
</html>