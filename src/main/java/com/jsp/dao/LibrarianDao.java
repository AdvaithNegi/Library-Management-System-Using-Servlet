package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Librarian;

public class LibrarianDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("advaith");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	// Save Record
	public Librarian saveLibrarian(Librarian librarian) {

		if (librarian != null) {
			entityTransaction.begin();
			entityManager.persist(librarian);
			entityTransaction.commit();
			return librarian;
		} else {
			return null;
		}

	}

	// Get By Id Record
	public Librarian getByIdLibrarian(int id) {
		return entityManager.find(Librarian.class, id);
	}

	// Delete Record
	public void deleteLibrarian(Librarian librarian) {
		if (librarian != null) {
			entityTransaction.begin();
			entityManager.remove(librarian);
			entityTransaction.commit();
		} else
			return;
	}

	// Update Record
	public Librarian updateLibrarian(Librarian librarian) {
		if (librarian != null) {
			entityTransaction.begin();
			entityManager.merge(librarian);
			entityTransaction.commit();
			return librarian;
		} else
			return null;
	}

	// Get All Record
	public List<Librarian> getAllLibrarians() {
		String sql = "select l from Librarian l";
		Query query = entityManager.createQuery(sql);
		List<Librarian> librarians = query.getResultList();
		return librarians;
	}

}
