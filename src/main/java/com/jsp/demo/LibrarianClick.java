package com.jsp.demo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/librarian")
public class LibrarianClick extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String save = req.getParameter("save");
		String update = req.getParameter("update");
		String delete = req.getParameter("delete");
		String getById = req.getParameter("getById");
		String getAll = req.getParameter("getAll");

		if (save != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("saveL.jsp");
			requestDispatcher.forward(req, resp);
		} else if (update != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("updateL.jsp");
			requestDispatcher.forward(req, resp);
		} else if (delete != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("deleteL.jsp");
			requestDispatcher.forward(req, resp);
		} else if (getById != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("getByIdL.jsp");
			requestDispatcher.forward(req, resp);
		} else if (getAll != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("getAllL.jsp");
			requestDispatcher.forward(req, resp);
		} else
			return;

	}

}
