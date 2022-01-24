package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
@RestController
public class TopicController {
    /*when spring sees the controller class it will also look into this class
    * for all those which needs dependecies so the keyword autowired will help spring
    * know that there is a class TopicService which need dependecies injection*/
    @Autowired
    private TopicService topicService;
    @RequestMapping("/topics")
   public List<Topics>getAllTopics(){
        return topicService.getAllTopics();

    }
    @RequestMapping("/topics/{id}")
    public Topics getTopic(@PathVariable String id){
        return topicService.getTopic(id);

    }
    /*map this to any request that is for post
    * here @RequestBody tells the spring that requestbody has a json data that is
    * instance of teh topics */
    @RequestMapping(method = RequestMethod.POST,value = "/topics")
    public void addTopics(@RequestBody Topics topics){
        topicService.addTopic(topics);

    }
 /*update the list*/
    @RequestMapping(method = RequestMethod.PUT,value ="/topics/{id}")
    public void updateTopic(@RequestBody Topics topics,@PathVariable String id){
        topicService.updateTopic(id,topics);
    }
    /*for deleting things*/
    @RequestMapping(method = RequestMethod.DELETE,value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id){
         topicService.deleteTopic(id);
    }
}
