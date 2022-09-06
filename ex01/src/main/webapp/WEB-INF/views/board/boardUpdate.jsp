<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>게시글 수정</title>
</head>
<style>
table {
	width: 50%;
	marging: 0 auto;
}
</style>
<body>
	<form name="updateForm" action="update" method="post">
		<table>
			<tr>
				<th>번호</th>
				<td><input type="text" name="bno" value=${board.bno } readonly></td>
			</tr>
			<tr>
				<th>제목</th>
				<td><input type="text" name="title" value=${board.title }></td>
			</tr>
			<tr>
				<th>작성자</th>
				<td><input type="text" name="writer" value=${board.writer }
					readonly></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea name="contents" cols="2" style="width: 200px;">${board.contents }</textarea></td>
			</tr>
			<tr>
				<th>첨부파일</th>
				<td><input type="text" name="image" value=${board.image }></td>
			</tr>

		</table>
		<button type="submit" onclick="formOption()">수정완료</button>
	</form>
</body>
<script>
	function formOption() {
		let title = document.getElementsByName('title')[0];
		let contents = document.getElementsByName('contents')[0];

		if (title.value == "") {
			alert("제목이 입력되지 않았습니다.");
			title.focus();
			return;
		}
		if (contents.value == "") {
			alert("내용이 입력되지 않았습니다.");
			contents.focus();
			return;
		}
		insertForm.submit();
	}
</script>
</html>