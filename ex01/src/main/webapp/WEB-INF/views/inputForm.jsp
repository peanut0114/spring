<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="userList" method="post">
		<input type="text" name="list[0].name">
		<input type="number" name="list[0].age"><br>
		<input type="text" name="list[1].name">
		<input type="number" name="list[1].age">
		<button type="submit">전송</button>
	</form>
</body>
</html>