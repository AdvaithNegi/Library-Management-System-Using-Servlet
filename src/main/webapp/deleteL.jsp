<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete</title>
</head>
<body>

	<h2>Delete Librarian</h2>
	
	<form action="deleteL" method="post">
	
	<label for="Lib_id">Librarian ID</label>
	<input type="number" name="id" placeholder="Enter Id to be Deleted"> <br> <br>
	<input type="submit" value="Delete">
	
	</form>
	

</body>
</html>