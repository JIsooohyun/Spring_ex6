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
<h1>Member Join</h1>
<form action="./memberWrite" method="post" enctype="multipart/form-data">
	<div class="form-group">
		<label for="ID">ID</label>
	    <input type="text" class="form-control" id="id" name="id">
  	</div>
  	<div class="form-group">
		<label for="PW">PW</label>
	    <input type="text" class="form-control" id="pw" name="pw">
  	</div>
  	<div class="form-group">
		<label for="Name">NAME</label>
	    <input type="text" class="form-control" id="name" name="name">
  	</div>
  	<div class="form-group">
		<label for="Email">EMAIL</label>
	    <input type="text" class="form-control" id="email" name="email">
  	</div>
  	  <div class="form-group">
  		<input type="file" name="photo">
  	   </div>
  	<button>Submit</button>
</form>
</div>
</body>
</html>