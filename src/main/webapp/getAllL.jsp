<%@page import="com.jsp.dto.Librarian"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.service.LibrarianService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Get All</title>
</head>
<body>

	<%LibrarianService librarianService = new LibrarianService();%>
	<%List<Librarian> librarians = librarianService.getAllLibrarians();	%>

	<table border="1" style="border-collapse: collapse;">
		
		<tr style="text-align: center;">
			<th><%="ID"%></th>
			<th><%="Name"%></th>
			<th><%="Password"%></th>
		</tr>
		
		<%for(Librarian librarian:librarians) {%>
		<tr>	
			<td><%= librarian.getId() %> </td>
			<td><%= librarian.getName() %> </td>
			<td><%= librarian.getPassword() %></td>
			</tr>
			<%	}	%>
	</table>
	<br> <br>
	<a href="home.jsp" style="color: red">Admin Home Page</a>
		
</body>
</html>