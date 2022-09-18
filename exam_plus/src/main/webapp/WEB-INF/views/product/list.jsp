<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>product list</title>
</head>
<style>
table, td, th{
	border : 1px solid black;
	text-align : center;
	border-collapse: separate;
}
</style>
<body>
<h3>상품 조회/수정</h3>
<table>
	<thead>
		<tr>
			<th>상품ID</th>
			<th>이름</th>
			<th>단가</th>
			<th>담당자</th>
			<th>등록일자</th>
			<th>공급업체</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${productList }" var="product">
			<tr>
				<td>${product.productId }</td>
				<td>${product.productName }</td>
				<td>${product.productPrice }</td>
				
				<c:choose>
					<c:when test="${product.managerId eq 'E201'}">
						<td>김사원</td>
					</c:when>
					<c:when test="${product.managerId eq 'E202'}">
						<td>이대리</td>
					</c:when>
					<c:otherwise><td>${product.managerId}</td></c:otherwise>
				</c:choose>
				<td><fmt:formatDate value="${product.productDate }" pattern="yyyy/MM/dd"/> </td>
				<td>${product.company }</td>
		</c:forEach>
	</tbody>
</table>
</body>
</html>