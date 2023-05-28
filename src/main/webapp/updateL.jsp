<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update</title>
</head>
<body>

	<h2>Update Librarian</h2>
	
	
	<form action="updateL" method="post">
	
	<label for="Lib_id">Librarian ID</label>
	<input type="number" name="id" placeholder="Enter Librarian ID"> <br> <br>
	<label for="Lib_pass1">Old Password</label>
	<input type="password" name="oldpass" placeholder="Enter your old password"> <br> <br>
	<label for="Lib_pass2">New Password</label>
	<input type="password" name="newpass" placeholder="Enter your new password"> <br> <br>
	<input type="submit" value="update">
	
	</form>
	

</body>
</html>