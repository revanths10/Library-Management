package com.edubridge.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.entity.Book;
import com.edubridge.repository.BookRepository;
import com.edubridge.service.BookService;

@Service
public class BookServiceImpl implements BookService
{
	
	@Autowired
	private BookRepository bookRepository;

	public BookServiceImpl(BookRepository bookRepository) 
	{
		super();
		this.bookRepository = bookRepository;
	}

	@Override
	public Book saveBook(Book book) 
	{
		return bookRepository.save(book);
	}

	@Override
	public Book updateBook(Book book, long id) 
	{
		Book existingBook = bookRepository.findById(id);
		existingBook.setBauthor(book.getBauthor());
		existingBook.setBcatag(book.getBcatag());
		existingBook.setBcopies(book.getBcopies());
		existingBook.setBdate(book.getBdate());
		existingBook.setBisbn(book.getBisbn());
		existingBook.setBpub(book.getBpub());
		existingBook.setBstatus(book.getBstatus());
		existingBook.setBtitle(book.getBtitle());
		existingBook.setByear(book.getByear());
		existingBook.setPubname(book.getPubname());
		existingBook.setId(book.getId());
		bookRepository.save(existingBook);
		return existingBook;
	}

	@Override
	public Book getBookById(long id) 
	{
		return bookRepository.findById(id);
	}

	@Override
	public List<Book> getAllBook() 
	{
		return bookRepository.findAll();
	}

	@Override
	public void deleteBook(long bookId) 
	{
		bookRepository.findById(bookId);
		bookRepository.deleteById(bookId);
	}

	@Override
	public List<Book> getBookByBstatus(String bstatus) 
	{
		return bookRepository.findBookByBstatus(bstatus);
	}
	
}
