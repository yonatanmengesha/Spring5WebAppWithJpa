package com.joteck.spring5web.service;

import com.joteck.spring5web.model.Book;

import java.util.List;

public interface BookService {

    Iterable<Book> getAllBooks();
    void saveBook(Book book);
}
