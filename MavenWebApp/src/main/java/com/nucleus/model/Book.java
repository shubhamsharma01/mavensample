package com.nucleus.model;

import java.io.Serializable;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;



public class Book implements Serializable 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Min(value=0)
	private String bookId;
	@Length(min=3,max=20)
	private String bookName;
	@Min(value=100)
	private String price;
	@Length(max=100)
	private String description;
	@NotNull
	private String publication;
	@NotBlank
	private String category;
	public Book()
	{}
	
	public Book(String bookId, String bookName, String price, 
			 String category,String publication,String description) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
		this.description = description;
		this.publication = publication;
		this.category = category;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "bookId=" + bookId + ", bookName=" + bookName + ", price="
				+ price + ", description=" + description + ", publication="
				+ publication + ", category=" + category + "";
	}	

}
