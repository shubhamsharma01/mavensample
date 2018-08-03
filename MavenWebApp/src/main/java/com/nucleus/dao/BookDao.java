
package com.nucleus.dao;

import org.springframework.stereotype.Repository;

import com.nucleus.model.Book;

public interface BookDao
{
	public void saveBook(Book book);
	public Book getBookByBookId(String bookId);
	public void deleteBookByBookId(String bookId);
	public Book update2(Book book);
	public Book update1(String bookid);
}
