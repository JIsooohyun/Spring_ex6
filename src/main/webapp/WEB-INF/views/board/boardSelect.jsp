<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${board}Select Page</h1>
	<h1>${boardDTO.title }</h1>
	<h1>${boardDTO.contents }</h1>
	
	<a href="${board}Update?num=${boardDTO.num}">Update</a>
	<a href="${board}Delete?num=${boardDTO.num}">Delete</a>
	<a href="${board}List">List</a>
</body>
</html>