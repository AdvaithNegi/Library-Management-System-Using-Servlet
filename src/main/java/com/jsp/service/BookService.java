package com.jsp.service;

import java.util.List;

import com.jsp.dao.BookDao;
import com.jsp.dto.Book;

public class BookService {

	BookDao bookDao = new BookDao();

	// Save Book
	public Book saveBook(Book book) {
		return bookDao.saveBook(book);
	}

	// Get By Id Book
	public Book getByIdBook(int id) {
		return bookDao.getByIDBook(id);
	}

	// Get All Book
	public List<Book> getAllBooks() {
		return bookDao.getAllBooks();
	}

}
