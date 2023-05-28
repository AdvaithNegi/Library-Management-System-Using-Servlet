package com.jsp.controller.librarian;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Librarian;
import com.jsp.service.LibrarianService;

@WebServlet("/getByIdL")
public class GetByIdLibrarian extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String s_id = req.getParameter("id");
		int id = Integer.parseInt(s_id);

		LibrarianService librarianService = new LibrarianService();
		Librarian librarian = librarianService.getByIdLibrarian(id);

		PrintWriter printWriter = resp.getWriter();
		printWriter
				.write("<html><head><body><h3> ID: " + librarian.getId() + "</h3> \n <h3> Name : " + librarian.getName()
						+ "</h3> \n <h3>Password: " + librarian.getPassword() + " </h3></body></head></html>");

		printWriter.print("<a href='home.jsp'>Admin Home Page</a>");

	}

}
