package com.jsp.service;

import java.util.List;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Book;
import com.jsp.dto.Student;

public class StudentService {

	StudentDao studentDao = new StudentDao();

	// Save Student
	public Student saveStudent(Student student) {
		return studentDao.saveStudent(student);
	}

	// Get By Id Student
	public Student getByIdStudent(int id) {
		return studentDao.getByIdStudent(id);
	}

	// Delete Student
	public void deleteStudent(int id) {
		Student student = studentDao.getByIdStudent(id);

		if (student != null) {
			studentDao.deleteStudent(student);
		} else {
			return;
		}
	}

	// Update Student
	public Student updateEmailStudent(Student student, int id) {
		Student student2 = studentDao.getByIdStudent(id);

		if (student.getEmail() != null)
			student2.setEmail(student.getEmail());

		if (student2 != null)
			return studentDao.updateStudent(student2);
		else
			return null;

	}

	// Get All Students
	public List<Student> getAllStudents() {
		return studentDao.getAllStudents();
	}

	// Borrow Book
	public boolean borrowBook(Student student, List<Book> books) {
		return studentDao.borrowBook(student, books);
	}

	// Return Book
	public boolean returnBook(Student student, List<Book> books) {
		return studentDao.returnBook(student, books);
	}

}
