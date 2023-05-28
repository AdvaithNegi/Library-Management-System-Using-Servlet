<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>

	<h2>Library Home Page</h2>

<form action="libHome" method="post">

<input type="submit" name="book" value="book"> <br> <br>
<input type="submit" name="issueBook" value="issueBook"> <br> <br>

<a href="liblogin.jsp" style="color: blue">Librarian Logout</a> <br> 
<a href="adminlogin.jsp" style="color: red">Logout Admin</a>

</form>


</body>
</html>