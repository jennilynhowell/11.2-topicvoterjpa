package com.jennilyn.controllers;

import com.jennilyn.interfaces.TopicRepository;
import com.jennilyn.models.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TopicController {

    @Autowired
    TopicRepository repo;

    @RequestMapping("/")
    public String index(){
        Iterable<Topic> topics = repo.findAll();
        return "index";
    }

}
