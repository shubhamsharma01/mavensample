package com.nucleus.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nucleus.dao.BookDao;
import com.nucleus.model.Book;

@Controller
public class ControllerOne {
	@Autowired
	BookDao bookDao;	
	
@RequestMapping("/insert")
public ModelAndView insert(Book book)
{  
	return new ModelAndView("BookRegistration");
	
}

@RequestMapping("/booksubmit")
public ModelAndView save( @Valid Book book , BindingResult result)
{   
	if(result.hasErrors())
	{
		return new ModelAndView("BookRegistration");
		
	}
	bookDao.saveBook(book);
	return new ModelAndView("success");
	
}
@RequestMapping("/delete")
public ModelAndView delete(Book book)
{
	
	return new ModelAndView("delete1");
}
@RequestMapping("/delete2")
public ModelAndView deleterecord(@RequestParam("bookId") String bookId)
{
	bookDao.deleteBookByBookId(bookId);
	return new ModelAndView("success");
}
@RequestMapping("/view")
public ModelAndView view1(Book book)
{
	
	return new ModelAndView("View1");
}
@RequestMapping("/view2")
public ModelAndView view(@RequestParam("bookId") String bookId)
{
	Book book=bookDao.getBookByBookId(bookId);
	return new ModelAndView("Viewone","book",book);
}
@RequestMapping("/update")
public ModelAndView updates(Book book)
{
	
	return new ModelAndView("Update1");
}
@RequestMapping("/update2")
public ModelAndView updates1(@RequestParam("bookId") String bookId)
{
	Book book=bookDao.update1(bookId);
	return new ModelAndView("Updateone","book",book);
}
@RequestMapping("/update123")

public ModelAndView saveupdate(Book book)
{   
	
	bookDao.update2(book);
	return new ModelAndView("success");
	
}	
	
}
