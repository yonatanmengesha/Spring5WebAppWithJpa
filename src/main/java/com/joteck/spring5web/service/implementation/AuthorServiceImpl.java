package com.joteck.spring5web.service.implementation;

import com.joteck.spring5web.model.Author;
import com.joteck.spring5web.repository.AuthorRepository;
import com.joteck.spring5web.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AuthorServiceImpl implements AuthorService {


    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> findAllAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public void saveAuthoer(Author author) {
        authorRepository.save(author);
    }
}
