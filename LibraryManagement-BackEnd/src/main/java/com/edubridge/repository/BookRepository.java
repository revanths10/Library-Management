package com.edubridge.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edubridge.entity.Admin;
import com.edubridge.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> 
{
	public Book findById(long id);
	public List<Book> findBookByBstatus(String bstatus);
}
