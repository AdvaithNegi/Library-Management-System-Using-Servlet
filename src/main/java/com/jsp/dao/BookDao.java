package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Book;

public class BookDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("advaith");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	// Save Record
	public Book saveBook(Book book) {
		if (book != null) {
			entityTransaction.begin();
			entityManager.persist(book);
			entityTransaction.commit();
			return book;
		}
		return null;
	}

	// Get By Id Record
	public Book getByIDBook(int id) {
		return entityManager.find(Book.class, id);
	}
	
	// Get All Records
	public List<Book> getAllBooks(){
		String sql="select b from Book b";
		Query query=entityManager.createQuery(sql);
		List<Book> books=query.getResultList();
		return books;
	}

}
