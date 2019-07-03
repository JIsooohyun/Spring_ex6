<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<a href="./notice/noticeList">Notice List</a>

<c:choose>
	<c:when test="${not empty member}">
		<a href="./member/memberPage">MyPage</a>
		<a href="./member/memberLogout">Member Logout</a>
	</c:when>
	<c:otherwise>
		<a href="./member/memberWrite">Member Join</a>
		<a href="./member/memberLogin">Member Login</a>
	</c:otherwise>
</c:choose>
</body>
</html>
