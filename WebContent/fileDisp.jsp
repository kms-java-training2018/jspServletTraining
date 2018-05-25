<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>出力結果</title>
<link rel="stylesheet" type="text/css" href="./main.css">
</head>
<body id="bgcolor">
    <h1>出力結果</h1>
    <table class="type06">
        <tbody>
            <c:forEach var="obj" items="${csv}" begin="0">
                <tr>
                    <td><c:out value="${obj}" /></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
