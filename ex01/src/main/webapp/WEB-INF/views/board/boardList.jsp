<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table { 
	text-align:center}
thead {
	background : gold;
}
</style>
</head>
<body>
<button onclick="location.href='insert'">글쓰기</button>
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>제복</th>
				<th>작성자</th>
				<th>작성일</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="board" items="${boardList }">
				<tr onclick="location.href='info?bno=${board.bno }'">
					<td>${board.bno }</td>
					<td>${board.title }</td>
					<td>${board.writer }</td>
					<td><fmt:formatDate value="${board.regdate}" pattern="yyyy/MM/dd"/> </td>
					<td><button onclick="deleteBtn(${board.bno},event)">삭제</button></td>
			</c:forEach>
		</tbody>
	</table>
</body>
<script>
function deleteBtn(bno,event){
	event.stopPropagation();
	location.href='delete/'+bno;
}
</script>
</html>