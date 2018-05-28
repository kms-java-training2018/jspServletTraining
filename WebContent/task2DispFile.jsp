<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>課題２｜ファイルの項目を表示</title>
</head>
<body>

<h1>指定されたファイルを表示します。</h1>

${fileContent}

<table>
  <caption>$[fileName]</caption>
  <tr>
    <th>名称</th>
    <th>味の特徴</th>
    <th>色</th>
  </tr>
  <tr>
    <td>りんご</td>
    <td>甘酸っぱい</td>
    <td>おおむね赤</td>
  </tr>
  <tr>
    <td>なつみかん</td>
    <td>かなり酸っぱいと思う</td>
    <td>たいてい黄色</td>
  </tr>
</table>

</body>
</html>