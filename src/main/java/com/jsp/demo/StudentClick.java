package com.jsp.demo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/student")
public class StudentClick extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String save = req.getParameter("save");
		String update = req.getParameter("update");
		String delete = req.getParameter("delete");
		String getById = req.getParameter("getById");
		String getAll = req.getParameter("getAll");

		if (save != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("saveS.jsp");
			requestDispatcher.forward(req, resp);
		} else if (update != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("updateS.jsp");
			requestDispatcher.forward(req, resp);
		} else if (delete != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("deleteS.jsp");
			requestDispatcher.forward(req, resp);
		} else if (getById != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("getByIdS.jsp");
			requestDispatcher.forward(req, resp);
		} else if (getAll != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("getAllS.jsp");
			requestDispatcher.forward(req, resp);
		} else
			return;

	}

}
