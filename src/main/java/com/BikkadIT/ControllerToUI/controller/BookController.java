package com.BikkadIT.ControllerToUI.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.BikkadIT.ControllerToUI.model.Book;

@Controller
public class BookController {

	@GetMapping("/book")
	public ModelAndView getBookData() {
		
		Book book= new Book();
		
		book.setBookID(111);
		book.setBookName("Java Programing");
		book.setBookPrice(499);
		
		ModelAndView mav =new ModelAndView();
		mav.addObject("BOOK", book);
		mav.setViewName("book");
		
				
		
		return mav;
		
	}
	
	@GetMapping("/booksList")
	public String getBooks(Model model) {
		
		Book book= new Book();
				book.setBookID(111);
		book.setBookName("Java Programing");
		book.setBookPrice(499);
		
		Book book1= new Book();
		book1.setBookID(222);
		book1.setBookName("C Programing");
		book1.setBookPrice(999);
		
		Book book2= new Book();
		book2.setBookID(333);
		book2.setBookName("C++ Programing");
		book2.setBookPrice(599);
		
		List<Book> list =new ArrayList();
		
		list.add(book);
		list.add(book1);
		list.add(book2);
		
		model.addAttribute("BOOKS", list);		
		
		return "books";
		
	}
}
