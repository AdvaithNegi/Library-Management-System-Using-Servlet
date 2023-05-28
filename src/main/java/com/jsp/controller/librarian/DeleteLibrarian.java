package com.jsp.controller.librarian;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.service.LibrarianService;

@WebServlet("/deleteL")
public class DeleteLibrarian extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String s_id = req.getParameter("id");
		int id = Integer.parseInt(s_id);

		LibrarianService librarianService = new LibrarianService();
		librarianService.deleteLibrarian(id);

		RequestDispatcher requestDispatcher = req.getRequestDispatcher("home.jsp");
		requestDispatcher.forward(req, resp);
	}

}
