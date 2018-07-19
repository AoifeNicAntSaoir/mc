package com.smbc.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.smbc.dto.BookDTO;
import com.smbc.model.Book;
import com.smbc.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	// goes to book.jsp
	@RequestMapping(value = "/book", method = RequestMethod.GET)
	public ModelAndView printBooks(ModelAndView model) {
		List<Book> listBook = bookService.getAllBooks();
		model.addObject("listBook", listBook);

		return model;
	}


    @RequestMapping(value = "/newBook", method = RequestMethod.GET)
    public ModelAndView newContact(ModelAndView model) {
		BookDTO book = new BookDTO();
		model.addObject("book", book);
        model.setViewName("BookForm");
        return model;
    }
    
	@RequestMapping(value = "/saveBook", method = RequestMethod.POST)
	public ModelAndView saveBook(@ModelAttribute Book book, ModelAndView model) {
		bookService.addBook(book);
		model.setViewName("book");
		return new ModelAndView("redirect:/book");
	}

}


