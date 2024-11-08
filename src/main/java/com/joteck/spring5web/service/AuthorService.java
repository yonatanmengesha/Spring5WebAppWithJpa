package com.joteck.spring5web.service;

import com.joteck.spring5web.model.Author;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AuthorService {

    Iterable<Author> findAllAuthors();
    void saveAuthoer(Author author);
}
