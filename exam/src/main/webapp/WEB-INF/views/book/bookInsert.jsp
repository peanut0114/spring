<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>empInsert.jsp</title>
</head>
<body>
<h4>도서 등록</h4>

<form name="insertForm" action="insert" method="post">
<table>
	<tr><th>도서번호</th><td><input name="bookNo"></td></tr>
	<tr><th>도서명</th><td><input name="BookName"></td></tr>
	<tr><th>도서표지</th><td><input name="BookCoverimg"></td></tr>
	<tr><th>출판일자</th><td><input name="bookDate"></td></tr>
	<tr><th>금액</th><td><input name="bookPrice"></td></tr>
	<tr><th>출판사</th><td><input name="bookPublisher"></td></tr>
	<tr><th>도서소개</th><td><textarea name="bookInfo"></textarea></td></tr>
</table>
	<button type="submit" onclick="formOption(event)">등록</button>
	<button type="button" onclick="location.href='list'">목록</button>
</form>
</body>
<script>
	function formOption(event){
		event.stopPropagation();

		let BookName = document.getElementsByName('BookName')[0];
	
		if(BookName.value ==""){
			alert("도서명을 입력해 주세요");
			BookName.focus();
			return;
		}
		alert("도서등록이 완료 되었습니다.");
		insertForm.submit();
	}
</script>
</html>