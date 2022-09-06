<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="insertInfo" method="post">

		<div>
			<label>first name : <input type="text" name="firstName" ></label>
		</div>
		<div>
			<label>last name : <input type="text" name="lastName"></label>
		</div>
		<div>
			<label>email : <input type="text" name="email"></label>
		</div>
		<div>
			<label>salary : <input type="text" name="salary" ></label>
		</div>
		<div>
			<label>job_id : <input type="text" name="jobId"></label>
		</div>
		<button type="submit">전송</button>
	</form>
</body>
</html>