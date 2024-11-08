package com.joteck.spring5web.bootstrap;

import com.joteck.spring5web.model.Author;
import com.joteck.spring5web.model.Book;
import com.joteck.spring5web.model.Publisher;
import com.joteck.spring5web.service.AuthorService;
import com.joteck.spring5web.service.BookService;
import com.joteck.spring5web.service.PublisherService;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private BookService bookService;
    private AuthorService authorService;
    private PublisherService publisherService;

    public DevBootstrap(BookService bookService, AuthorService authorService, PublisherService publisherService) {
        this.bookService = bookService;
        this.authorService = authorService;
        this.publisherService = publisherService;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();

    }

    private void initData() {

       Publisher publisher = new
                Publisher("Yonatan", "SilverSpring,Maryland");

       publisherService.savePublisher(publisher);

        //Eric
        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Development", "1234", publisher);


        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorService.saveAuthoer(eric);
        bookService.saveBook(ddd);


        //Rod
        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "23444", publisher );
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorService.saveAuthoer(rod);
        bookService.saveBook(noEJB);
    }
}
