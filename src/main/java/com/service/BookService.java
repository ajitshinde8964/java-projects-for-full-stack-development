package com.service;

import java.util.List;
import java.util.Optional;


import com.model.Book;



public interface BookService {

	Book addBook(Book book);
	List<Book> getbook();
	Optional<Object> updateUser(Book book, Long id);

	void deleteBook(Long id);
	Optional<Book> getBookById(Long id);
}
