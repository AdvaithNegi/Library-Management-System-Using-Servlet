package com.jsp.controller.librarian;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Librarian;
import com.jsp.service.LibrarianService;

@WebServlet("/updateL")
public class UpdateLibrarian extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String s_id = req.getParameter("id");
		String oldpass = req.getParameter("oldpass");
		String newpass = req.getParameter("newpass");

		int id = Integer.parseInt(s_id);

		LibrarianService librarianService = new LibrarianService();
		Librarian librarian = librarianService.getByIdLibrarian(id);

		if (librarian.getPassword().equals(oldpass)) {
			librarian.setPassword(newpass);
			librarianService.updatePasswordLibrarian(librarian, id);
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("home.jsp");
			requestDispatcher.forward(req, resp);
		} else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("updateL.jsp");
			requestDispatcher.include(req, resp);
		}

	}
}
