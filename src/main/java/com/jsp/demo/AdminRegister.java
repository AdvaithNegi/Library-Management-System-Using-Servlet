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

@WebServlet("/adminRegister")
public class AdminRegister extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		String password = req.getParameter("password");

		Admin admin = new Admin();
		admin.setName(name);
		admin.setPassword(password);

		AdminService adminService = new AdminService();
		adminService.saveAdmin(admin);

		RequestDispatcher requestDispatcher = req.getRequestDispatcher("adminlogin.jsp");
		requestDispatcher.forward(req, resp);

	}

}
