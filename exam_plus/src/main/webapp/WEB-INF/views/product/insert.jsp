<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert product</title>
</head>
<style>
table, td, th {
	border: 1px solid grey;
	border-collapse: separate;
	text-align: center;
}
td{
	text-align: left;
}
</style>
<body>
	<h3>상품 등록</h3>
	<form name="insertForm" action="insert" method="post"
		onsubmit="return false">
		<table>
			<tr>
				<th>상품ID</th>
				<td><input name='productId' value='${productId}' readonly></td>
			</tr>
			<tr>
				<th>이름</th>
				<td><input name='productName' id='productName'></td>
			</tr>
			<tr>
				<th>단가</th>
				<td><input name='productPrice'></td>
			</tr>
			<tr>
				<th>상품정보</th>
				<td><textarea name='productInfo' cols="30" rows="3" ></textarea></td>
			</tr>
			<tr>
				<th>등록일자</th>
				<td><input name='productDate' id='productDate' readonly></td>
			</tr>
			<tr>
				<th>공급업체</th>
				<td><input name='company'></td>
			</tr>
			<tr>
				<th>담당자</th>
				<td><input name='managerId'></td>
			</tr>
		</table>
		<button type="button" onclick="formOption()">등록</button>
		<button type="button" onclick="location.href='${pageContext.request.contextPath}/product/list'">조회</button>
	</form>
</body>
<script>
	printSysdate();
	function printSysdate() {
		let now = new Date();
		let str = now.getFullYear() + '/'
				+ (now.getMonth() < 10 ? "0" + now.getMonth() : now.getMonth())
				+ '/' + now.getDate();
		document.querySelector('#productDate').value = str;
	}
	function formOption() {
		let pName = document.querySelector('#productName');
		console.log(pName);

		if (pName.value == "" || pName.value == null) {
			alert("상품명이 입력되지 않았습니다.");
			pName.focus();
			return;
		}
		alert("상품등록이 완료 되었습니다.");
		document.querySelector('#productDate').value = '';
		insertForm.submit();
	}
</script>
</html>