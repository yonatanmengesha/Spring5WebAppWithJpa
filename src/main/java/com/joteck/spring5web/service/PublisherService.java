package com.joteck.spring5web.service;

import com.joteck.spring5web.model.Publisher;

public interface PublisherService {

    Iterable<Publisher> getAllPublisher();

   void  savePublisher(Publisher publisher);
}
