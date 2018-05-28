<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>出力結果</title>
</head>
<body>
	<form action="/jspServletTraining/task2Login" method="POST">
		${fileData}
		<!-- Task2FileCheckにて読み込んだデータ（fileData）を出力 -->
		<p>
			<input type="submit" value="ログアウト">
			<!-- LoginServletに移動させることで、loginIdを
			nullにしていることからLoginのjspに移動させる。 -->
		</p>
	</form>
</body>
</html>