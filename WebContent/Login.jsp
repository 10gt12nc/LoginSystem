<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>
		<font color="red">${message}</font>
	</p>
	<form action="login" method="post">

		<p>
			<input type="text" name="username" size="20" maxlength="16">
		</p>
		<p>
			<input type="password" name="password" size="20" maxlength="16">
		</p>
		<p>
			<input type="submit" value="登入">
		</p>

	</form>



</body>
</html>