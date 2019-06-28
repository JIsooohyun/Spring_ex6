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
	<h1>${board} List</h1>
	<table>
		<tr>
			<td>NUM</td>
			<td>TILTE</td>
			<td>WRITER</td>
			<td>DATE</td>
			<td>HIT</td>
		</tr>
		<c:forEach items="${ar}" var="boardDTO">
		<tr>
			<td>${boardDTO.num}</td>
			<td><a href="./${board}Select?num=${boardDTO.num}">${boardDTO.title}</a></td>
			<td>${boardDTO.writer}</td>
			<td>${boardDTO.reg_date}</td>
			<td>${boardDTO.hit }</td>
		</tr>
		</c:forEach>
	</table>
	
	<a href="./${board}Write">Notice Write</a>
</body>
</html>