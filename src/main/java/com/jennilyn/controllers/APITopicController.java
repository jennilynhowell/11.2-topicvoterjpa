package com.jennilyn.controllers;

import com.jennilyn.interfaces.TopicRepository;
import com.jennilyn.models.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class APITopicController {

    @Autowired
    TopicRepository topicRepo;

    @RequestMapping("/api/topics")
    public Iterable<Topic> topicApiList(){
        return topicRepo.findAll();
    }

    @RequestMapping("api/topics/{topicId}")
    public Topic topicApiDetail(@PathVariable("topicId") long topicId){
        return topicRepo.findOne(topicId);
    }

}
