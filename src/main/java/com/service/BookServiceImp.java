package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;


import com.model.Book;
import com.repository.BookRepository;

@Service
public class BookServiceImp implements BookService {

	@Autowired
	private BookRepository bookRepo;
	@Override
	public Book addBook(Book book) {
		return bookRepo.save(book);
	}

	@Override
	public List<Book> getbook() {
		return bookRepo.findAll();	}

	
		
	@Override
	public Optional<Object> updateUser(Book book, Long id) {
	
		 return bookRepo.findById(id).map(st -> {
	            st.setBookTitle(book.getBookTitle());
	           st.setImageUrl(book.getImageUrl());
	           st.setEmailId(book.getEmailId());
	           st.setPrice(book.getPrice());
	            return bookRepo.save(st);
	            
	        }
		 );
		 
	}

	



	@Override
	public void deleteBook(Long id) {
		bookRepo.deleteById(id);
		
	}

	@Override
	public Optional<Book> getBookById(Long id) {
		return bookRepo.findById(id);
	}

	
	
}
	



