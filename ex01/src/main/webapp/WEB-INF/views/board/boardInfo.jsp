<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>게시글 페이지</title>
</head>
<style>
table{width:50%;marging:0 auto;}
</style>
<body>
	<table>
		<tr>
			<th>번호</th>
			<td>${board.bno }</td>
		</tr>
		<tr>
			<th>제목</th>
			<td>${board.title }</td>
		</tr>
		<tr>
			<th>작성자</th>
			<td>${board.writer }</td>
		</tr>
		<tr>
			<th>내용</th>
			<td><textarea cols="2" style="width:200px;border:none" readonly >${board.contents}</textarea></td>
		</tr>
		<tr>
			<th>첨부파일</th>
			<td><img src="<c:url value='/resources/images/${board.image}'/>" style="width:50%" alt="이미지" /></td>
		</tr>
		<tr>
			<th>작성일자</th>
			<td><fmt:formatDate value="${board.regdate }" pattern="yyyy년 MM월 dd일"/></td>
		</tr>
	</table>
	<button type="button" onclick="location.href='update?bno=${board.bno}'">수정</button>
</body>
</html>