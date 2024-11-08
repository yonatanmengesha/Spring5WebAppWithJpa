package com.joteck.spring5web.controller;

import com.joteck.spring5web.service.PublisherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PublisherController {

    private PublisherService publisherService;

    public PublisherController(PublisherService publisherService) {
        this.publisherService = publisherService;
    }

    @RequestMapping(value="/publishers",method= RequestMethod.GET)
    public String getAllPublishers(Model model ){

        model.addAttribute("publishers",publisherService.getAllPublisher());


        return "publisherTemplate";

    }
}
