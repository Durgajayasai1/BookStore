package com.klef.jfsd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.entity.Book;
import com.klef.jfsd.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	BookRepository bookrepo;

	public void save(Book b) {
		bookrepo.save(b);
	}

	public List<Book> getAllBook() {
		return bookrepo.findAll();
	}

	public Book getBookById(int id) {
		return bookrepo.findById(id).get();
	}

	public void deleteById(int id) {
		bookrepo.deleteById(id);
	}
}
