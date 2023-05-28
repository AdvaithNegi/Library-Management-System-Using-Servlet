<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Librarian Login</title>
</head>
<body>

	<h2>Librarian Login Page</h2>

	<form action="liblogin" method="post">
	
	<label for="ID">ID:</label>
	<input type="number" name="id" placeholder="Enter your ID"> <br> <br>
	<label for="password">Password:</label>
	<input type="password" name="password" placeholder="Enter your password"> <br> <br>
	<input type="submit" value="login"> <br> <br>
	
	<a href="home.jsp" style="color: red">Admin Home Page</a>
	
	</form>

</body>
</html>