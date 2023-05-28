<%@page import="com.jsp.dto.Student"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.service.StudentService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% StudentService studentService = new StudentService(); %>
	<% List<Student> students = studentService.getAllStudents();%>
	

	<table border="1" style="border-collapse: collapse;">
		<tr style="text-align: center;">
			<th><%="ID"%></th>
			<th><%="Name"%></th>
			<th><%="Email"%></th>
		</tr>
		
		<%	for (Student student : students) {	%>
	
		<tr>	
			<td><%= student.getId() %> </td>
			<td><%= student.getName() %> </td>
			<td><%= student.getEmail() %></td>
		</tr>
			<%	}	%>
	</table>
	<br> <br>
	<a href="home.jsp" style="color: red">Admin Home Page</a>

</body>
</html>