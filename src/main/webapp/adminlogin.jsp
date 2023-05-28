<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>

<h2>Admin Login</h2>

	<form action="admin" method="post">
	
ID: 		<input type="number" name="id" placeholder="Enter your ID"> <br> <br>
Name:		<input type="text" name="name" placeholder="Enter your Name"> <br> <br>
Password:	<input type="password" name="password" placeholder="Enter your Password"> <br> <br>
	<input type="submit" value="login"> <br> <br>
	
	<a href="adminRegister.jsp">Register</a>
	
	</form>

</body>
</html>