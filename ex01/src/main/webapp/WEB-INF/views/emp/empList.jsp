<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전체조회</title>
<style>
table, tr, th, td {
	border: 1px solid lightgray;
	border-collapse: collapse;
	padding: 5px;
}
</style>
</head>
<body>
	<h1>Emp Table</h1>
	<button onclick="location.href='insertFrom'">추가</button>
	<table>
		<thead>
			<tr>
				<th>employee_id</th>
				<th>first_name</th>
				<th>last_name</th>
				<th>email</th>
				<th>hire_date</th>
				<th>job_id</th>
				<th>salary</th>
				<th>delete</th>
			</tr>
		</thead>

		<c:forEach var="emp" items="${ empList }">
			<div>
				<tr onclick="location.href='getInfo?employeeId=${emp.employeeId}'">
					<td>${emp.employeeId }</td>
					<td>${emp.firstName }</td>
					<td>${emp.lastName }</td>
					<td>${emp.email }</td>
					<td>${emp.hireDate }</td>
					<td>${emp.jobId }</td>
					<td>${emp.salary }</td>
					<td><button type="button"
							onclick="deleteInfo(${emp.employeeId},event)">삭제</button></td>
				</tr>
			</div>
		</c:forEach>
	</table>

</body>
<script>
function deleteInfo(id,event){	//매개변수로 event를 넣어야 페이지 변환이 일어나지 않는다..?
	event.stopPropagation();	//이벤트 버블링을 막아 상위 요소의 이벤트 일어나지 않게 한다
	location.href='deleteInfo/'+id;
}

</script>
</html>