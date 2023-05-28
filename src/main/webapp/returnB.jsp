<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Return Book</title>
</head>
<body>

<h2>Return Book Page</h2>

	<form action="returnB" method="post">
	
	<label for="Student_id">Student ID</label>
	<input type="number" name="sid" placeholder="Enter Student ID"> <br> <br>
	<label for="Book_id">Book ID</label>
	<input type="number" name="bid" placeholder="Enter Book ID"> <br> <br>
	<input type="submit" value="Returning">
	
	
	</form>

</body>
</html>