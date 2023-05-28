package com.jsp.service;

import java.util.List;

import com.jsp.dao.LibrarianDao;
import com.jsp.dto.Librarian;

public class LibrarianService {

	LibrarianDao librarianDao = new LibrarianDao();

	// Save Librarian
	public Librarian saveLibrarian(Librarian librarian) {
		return librarianDao.saveLibrarian(librarian);
	}

	// Get By Id Librarian
	public Librarian getByIdLibrarian(int id) {
		return librarianDao.getByIdLibrarian(id);
	}

	// Delete Librarian
	public void deleteLibrarian(int id) {
		Librarian librarian = librarianDao.getByIdLibrarian(id);

		if (librarian != null) {
			librarianDao.deleteLibrarian(librarian);
		} else
			return;
	}

	// update Librarian
	public Librarian updatePasswordLibrarian(Librarian librarian, int id) {
		Librarian librarian2 = librarianDao.getByIdLibrarian(id);

		if (librarian.getPassword() != null) {
			librarian2.setPassword(librarian.getPassword());
		}

		if (librarian2 != null) {
			return librarianDao.updateLibrarian(librarian2);
		} else
			return null;
	}

	// Get All Librarians
	public List<Librarian> getAllLibrarians() {
		return librarianDao.getAllLibrarians();
	}

}
