package com.edubridge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.edubridge.entity.Book;
import com.edubridge.entity.Member;
import com.edubridge.service.BookService;
import com.edubridge.service.MemberService;

@RestController
@CrossOrigin("*")
@RequestMapping("/books")
public class BookController 
{	
	@Autowired
	private BookService bookService;

	public BookController(BookService bookService) 
	{
		super();
		this.bookService = bookService;
	}
	
	//Register Book
	@PostMapping("/save")
	public ResponseEntity<Book> saveBook(@RequestBody Book book)
	{
		return new ResponseEntity<Book>(bookService.saveBook(book),HttpStatus.CREATED);
	}
	
	@GetMapping("/{bstatus}+{fil}")
    public List<Book> getBooksByBstatus(@RequestBody String bstatus) 
	{
		System.out.println(bstatus);
        return bookService.getBookByBstatus(bstatus);
    }
	
	//Update Book	
	@PutMapping("{bookId}/{book}")
	public ResponseEntity<Book> updateBook(@PathVariable("id") long id, @RequestBody Book book)
	{
		return new ResponseEntity<Book> (bookService.updateBook(book, id),HttpStatus.OK);
	}
	
	//Get All Customer	
	@GetMapping()
	public List<Book> getAllBook()
	{
		return bookService.getAllBook();
	}
	
	//get Student by id
	@GetMapping("/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable("id") long id)
	{
		return new ResponseEntity<Book> (bookService.getBookById(id),HttpStatus.OK);
	}
		
	//Delete Student	
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> deleteBook(@PathVariable("id") long id)
	{
		bookService.deleteBook(id);
		boolean flag=true;
		return new ResponseEntity<Boolean>(flag,HttpStatus.OK);
	}
}

