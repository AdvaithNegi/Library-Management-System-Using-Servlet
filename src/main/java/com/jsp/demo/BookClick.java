package com.jsp.demo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/book")
public class BookClick extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String save = req.getParameter("save");
		String getById = req.getParameter("getById");
		String getAll = req.getParameter("getAll");

		if (save != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("saveB.jsp");
			requestDispatcher.forward(req, resp);
		} else if (getById != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("getByIdB.jsp");
			requestDispatcher.forward(req, resp);
		} else if (getAll != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("getAllB.jsp");
			requestDispatcher.forward(req, resp);
		} else
			return;

	}

}
