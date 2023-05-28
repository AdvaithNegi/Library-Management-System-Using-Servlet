<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Home Page</title>
</head>
<body>


<form action="student" method="post">

<input type="submit" name="save" value="Save Student"> <br> <br>
<input type="submit" name="update" value="Update Student"> <br> <br>
<input type="submit" name="delete" value="Delete Student"> <br> <br>
<input type="submit" name="getById" value="Get By Id Student"> <br> <br>
<input type="submit" name="getAll" value="Get All Student"> <br> <br>

<a href="home.jsp" style="color: red">Admin Home Page</a>

</form>

</body>
</html>