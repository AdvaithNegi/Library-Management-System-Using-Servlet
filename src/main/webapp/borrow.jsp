<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Borrow Book</title>
</head>
<body>

<h2>Borrow Book Page</h2>

	<form action="borrow" method="post">
	
	<label for="Student_ID">Student ID</label>
	<input type="number" name="sid" placeholder="Enter Student ID"> <br> <br>
	<label for="Book_ID">Book ID</label>
	<input type="number" name="bid" placeholder="Enter Book Id"> <br> <br>
	<input type="submit" value="Borrowing">
	</form>

</body>
</html>