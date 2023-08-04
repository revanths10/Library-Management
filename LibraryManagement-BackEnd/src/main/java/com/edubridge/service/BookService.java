package com.edubridge.service;

import java.util.List;

import com.edubridge.entity.Book;

public interface BookService 
{
	Book saveBook(Book book);
	Book updateBook(Book book,long id);
	Book getBookById(long id);
	List<Book> getAllBook();
	void deleteBook(long id);
	List<Book> getBookByBstatus(String bstatus);
}
