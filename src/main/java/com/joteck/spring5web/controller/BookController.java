package com.joteck.spring5web.controller;

import com.joteck.spring5web.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookController {

   private  BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping(value="/books",method= RequestMethod.GET)
    public String getListOfBooks(Model model){

        model.addAttribute("books",bookService.getAllBooks());


        return "booksTemplate";


    }
}
