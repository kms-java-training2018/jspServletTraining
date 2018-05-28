<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ファイルの出力</title>
</head>
<body>
    <table border="3" width="700" height="150">
        <c:forEach var="i" items="${data}" varStatus="status">
            <tr>
                <c:choose>
                    <c:when test="${i!=''}">
                        <td><c:if test="${i=='名前' }">
                                <c:out value="${i}" />
                            </c:if></td>
                            <c:if test="${status.count != 1}">
                        <td><c:if test="${i!='名前' }">

                                    <c:out value="${i }" />
                                </c:if>
                            </td></c:if>
                    </c:when>
                </c:choose>
            </tr>
        </c:forEach>

    </table>
</body>
</html>