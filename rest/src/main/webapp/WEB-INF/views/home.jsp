<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="application/json;charset=UTF-8">
<title>Home</title>
</head>
<body>
	<h1>Hello world!</h1>

	<P>The time on the server is ${serverTime}.</P>
	<button type="button" onclick="getMovie()">getInfo</button>
	<button type="button" onclick="getBoxOffice()">getBoxOffice</button>
	<script type="text/javascript">
	function getMovie(){
		fetch("restAPI")
		.then((response) => response.json())
		.then((data) => console.log(data))
	}
	function getBoxOffice(){
		fetch("restAPI")
		.then((response) => response.json())
		.then((data) => console.log(data))
	}
	</script>
</body>
</html>
