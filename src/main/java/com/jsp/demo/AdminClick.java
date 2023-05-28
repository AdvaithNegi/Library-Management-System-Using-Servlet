package com.jsp.demo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Admin;
import com.jsp.service.AdminService;

@WebServlet("/admin")
public class AdminClick extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String aid = req.getParameter("id");
		String name = req.getParameter("name");
		String password = req.getParameter("password");

		int id = Integer.parseInt(aid);

		AdminService adminService = new AdminService();
		Admin admin = adminService.getByIdAdmin(id);

		if (name.equals(admin.getName()) && password.equals(admin.getPassword())) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("home.jsp");
			requestDispatcher.forward(req, resp);
		} else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("adminlogin.jsp");
			requestDispatcher.include(req, resp);
		}

	}

}
