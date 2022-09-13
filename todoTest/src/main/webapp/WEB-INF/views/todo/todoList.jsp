<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>TODO LIST</h3>
	<c:forEach var="todo" items="${todoList }">
		<ul>
			<li>no. ${todo.no }</li>
			<li>id : ${todo.id}</li>
			<li>내용 : ${todo.contents }</li>
		</ul>
	</c:forEach>
</body>
</html>