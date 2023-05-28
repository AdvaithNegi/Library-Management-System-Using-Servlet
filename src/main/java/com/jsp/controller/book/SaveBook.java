package com.jsp.controller.book;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Book;
import com.jsp.service.BookService;

@WebServlet("/saveB")
public class SaveBook extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String bname = req.getParameter("bname");
		String aname = req.getParameter("aname");
		String edition = req.getParameter("edition");

		Book book = new Book();
		book.setB_name(bname);
		book.setAuthor_name(aname);
		book.setEdition(edition);

		BookService bookService = new BookService();
		bookService.saveBook(book);

		RequestDispatcher requestDispatcher = req.getRequestDispatcher("libHome.jsp");
		requestDispatcher.forward(req, resp);

	}

}
