<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<form action="./memberLogin" method="post">
		<div class="form-group">
			<label for="ID">ID</label>
		    <input type="text" class="form-control" id="id" name="id">
	  	</div>
	  	<div class="form-group">
			<label for="PW">PW</label>
		    <input type="text" class="form-control" id="pw" name="pw">
  		</div>
  		<button>Submit</button>
	</form>
</div>
</body>
</html>