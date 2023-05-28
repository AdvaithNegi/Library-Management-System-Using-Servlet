<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Home Page</title>
</head>
<body>


<h1>Admin Home Page</h1>

<form action="home" method="post">

	<input type="submit" name="librarian" value="LIBRARIAN"> <br> <br>
	<input type="submit" name="student" value="STUDENT"> <br> <br>
	
	<a href="liblogin.jsp" style="color: blue">Librarian Login</a> <br>
	<a href="adminlogin.jsp" style="color: red">Logout Admin</a>

</form>

</body>
</html>