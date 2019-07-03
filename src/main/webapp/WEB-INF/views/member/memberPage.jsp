<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<title>Insert title here</title>
</head>
<body>
<div class="container">
	<h1> Member Page</h1>
	
	<h3>ID : ${member.id}</h3>
	<h3>NAME : ${member.name}</h3>
	<h3>EMAIL : ${member.email}</h3>
	
	<img alt="${member.memberFileDTO.oname}" src="../resources/member/${member.memberFileDTO.fname}">
</div>
</body>
</html>