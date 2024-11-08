package com.joteck.spring5web.controller;


import com.joteck.spring5web.service.AuthorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthorController {

    private AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/authors")
    public String getAllAuthors(Model model){

        model.addAttribute("authors",authorService.findAllAuthors());

        return "authorsTemplate";
    }
}
