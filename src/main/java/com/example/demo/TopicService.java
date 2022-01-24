package com.example.demo;
import java.util.Arrays;
import java.util.*;

import org.springframework.stereotype.Service;

/*when the spring start application this service is stored in the memory of spring
* the spring then use this in order to carry out its work, sping will create intances of
* all those classes which are marked by @service annotattion*/
@Service
public class TopicService {
   private List<Topics> topic = new ArrayList<>(Arrays.asList(
            new Topics("spring","spring Framework","spring Framework Description"),
            new Topics("java","good course","use it good ")
    ));
 public List<Topics>getAllTopics(){
     return topic;
 }
 public Topics getTopic(String id){
     return topic.stream().filter(t->t.getId().equals(id)).findFirst().get();
 }
 public void addTopic(Topics topics){
     topic.add(topics);
 }
  public void updateTopic(String id,Topics topics){
     for(int i=0;i< topic.size();i++){
         Topics t = topic.get(i);
         if(t.getId().equals(id))
         {
             topic.set(i,topics);
             return;
         }
     }
  }

    public void deleteTopic(String id) {
     topic.removeIf(t->t.getId().equals(id));
    }
}
