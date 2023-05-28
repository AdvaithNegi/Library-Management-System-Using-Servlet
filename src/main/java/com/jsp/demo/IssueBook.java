package com.jsp.demo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/issuebook")
public class IssueBook extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String borrow = req.getParameter("borrow");
		String returnB = req.getParameter("returnB");

		if (borrow != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("borrow.jsp");
			requestDispatcher.forward(req, resp);
		} else if (returnB != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("returnB.jsp");
			requestDispatcher.forward(req, resp);
		} else
			return;

	}

}
