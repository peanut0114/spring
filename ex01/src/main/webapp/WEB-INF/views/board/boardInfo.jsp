<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�Խñ� ������</title>
</head>
<body>
	<table>
		<tr>
			<th>��ȣ</th>
			<td>${board.bno }</td>
		</tr>
		<tr>
			<th>����</th>
			<td>${board.title }</td>
		</tr>
		<tr>
			<th>�ۼ���</th>
			<td>${board.writer }</td>
		</tr>
		<tr>
			<th>����</th>
			<td><textarea cols="2" style="width:200px;border:none" readonly >${board.contents}</textarea></td>
		</tr>
		<tr>
			<th>÷������</th>
			<!-- <img src='/resources/images/${board.image}'> �̷��� ������ ���������� ã�ư��� ���Ѵ� (html�� �ν�) -->
			<!-- http�� �̿��� �ܺ� �ҽ�����, /�� ��Ÿ���� ��Ʈ�� ��� �������� ���� ���Ѵ�.. �Ʒ� �ΰ��� ����� ���� -->
			<td><img src="<c:url value='/resources/images/${board.image}'/>" style="width:50%" alt="�̹���" /></td>
			<td><img src="${pageContext.request.contextPath}/resources/images/${board.image}" style="width:50%" alt="�̹���" /></td>
		</tr>
		<tr>
			<th>�ۼ�����</th>
			<td><fmt:formatDate value="${board.regdate }" pattern="yyyy�� MM�� dd��"/></td>
		</tr>
	</table>
	<button type="button" onclick="location.href='update?bno=${board.bno}'">����</button>
</body>
</html>