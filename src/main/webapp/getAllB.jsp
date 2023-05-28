<%@page import="com.jsp.dto.Book"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.service.BookService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Get All Books</title>
</head>
<body>

<% BookService bookService= new BookService(); %>
<% List<Book> books=bookService.getAllBooks(); %>

<table border="1" style="border-collapse: collapse;">
		
		<tr style="text-align: center;">
			<th><%="ID"%></th>
			<th><%="Book Name"%></th>
			<th><%="Author Name"%></th>
			<th><%="Edition"%></th>
		</tr>
		
		<% for(Book book:books) {%>
		<tr>
			<td><%= book.getId() %> </td>
			<td><%= book.getB_name() %> </td>
			<td><%= book.getAuthor_name() %></td>
			<td><%= book.getEdition() %></td>
		</tr>
			
			<% } %>
</table>

</body>
</html>