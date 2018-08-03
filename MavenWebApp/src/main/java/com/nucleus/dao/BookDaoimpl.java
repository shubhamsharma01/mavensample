package com.nucleus.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nucleus.model.Book;
@Repository
public class BookDaoimpl implements BookDao
{
	@Autowired
     JdbcTemplate jdbctemplate;
	public void saveBook(Book book) {
		Object[] object={book.getBookId(),book.getBookName(),book.getPrice(),book.getCategory(),book.getPublication(),book.getDescription()};
		jdbctemplate.update("insert into bookentry values(?,?,?,?,?,?)",object);
		
	}

	public Book getBookByBookId(String bookId) {
    
		return jdbctemplate.queryForObject("select * from bookentry where bookId=?", new Object[]{bookId}, new BeanPropertyRowMapper<Book>(Book.class));
	}

	public void deleteBookByBookId(String bookId) {
		
		jdbctemplate.update("delete from bookentry where bookId=?",bookId);
	}

	public Book update2(Book book) {
	
		  jdbctemplate.update("update bookentry set bookName = '"+book.getBookName()+"', price='"+book.getPrice()+"', category='"+book.getCategory()+"',publication='"+book.getPublication()+"',description='"+book.getDescription()+"' where bookId='"+book.getBookId()+"'");
		  return book;
		
	}


	public Book update1(String bookid) {
		
		return jdbctemplate.queryForObject("select * from bookentry where bookId=?", new Object[]{bookid}, new BeanPropertyRowMapper<Book>(Book.class));
	}
	

}
