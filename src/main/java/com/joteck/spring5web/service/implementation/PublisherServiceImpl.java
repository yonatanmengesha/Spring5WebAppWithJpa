package com.joteck.spring5web.service.implementation;

import com.joteck.spring5web.model.Publisher;
import com.joteck.spring5web.repository.PublisherRepository;
import com.joteck.spring5web.service.PublisherService;
import org.springframework.stereotype.Service;

@Service
public class PublisherServiceImpl implements PublisherService {

    private final PublisherRepository publisherRepository;

    public PublisherServiceImpl(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @Override
    public Iterable<Publisher> getAllPublisher() {
        return publisherRepository.findAll();
    }

    public void savePublisher(Publisher publisher){
        publisherRepository.save(publisher);
    }
}
