<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>${board}Write</h1>
<form action="./${board}Write" method="post">
	<input type="text" name="title">
	<br>
	<input type="text" name="writer">
	<br>
	<input type="text" name="contents">
	<button>Submit</button>
</form>
</body>
</html>