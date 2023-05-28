<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update</title>
</head>
<body>

	<h2>Update Student</h2>
	
	<form action="updateS" method="post">
	
	ID: <input type="number" name="id" placeholder="Enter Student ID"> <br> <br>
	Old Email: <input type="email" name="oldemail" placeholder="Enter your Old Email"> <br> <br>
	New Email: <input type="email" name="newemail" placeholder="Enter your New Email"> <br> <br>
	<input type="submit" value="Update">
	
	
	</form>
	

</body>
</html>