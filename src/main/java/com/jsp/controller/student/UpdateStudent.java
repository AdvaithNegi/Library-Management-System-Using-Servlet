package com.jsp.controller.student;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

@WebServlet("/updateS")
public class UpdateStudent extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String sid = req.getParameter("name");
		String oldemail = req.getParameter("oldemail");
		String newemail = req.getParameter("newemail");

		int id = Integer.parseInt(sid);

		StudentService studentService = new StudentService();
		Student student = studentService.getByIdStudent(id);

		if (student.getEmail().equals(oldemail)) {
			student.setEmail(newemail);
			studentService.updateEmailStudent(student, id);
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("home.jsp");
			requestDispatcher.forward(req, resp);
		} else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("updateS.jsp");
			requestDispatcher.include(req, resp);
		}

	}

}
