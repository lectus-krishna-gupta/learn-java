package com.example.demo.Topics;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

        private List<topic> topics =new ArrayList<>( Arrays.asList(
                    new topic("krishna", "gupta", "lectus"),
                    new topic("mitesh", "g", "lectus"),
                    new topic("sahil", "gupta", "lectus")
            ));

        public List<topic> getAllTopics() {
            return topics;
        }

    public topic getTopics(String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(topic topic){
            topics.add(topic);
    }

    public void updateTopic(String id, topic topic){
        for(int i = 0; i <topics.size(); i++){
            topic t = topics.get(i);
            if(t.getId().equals(id)){
                topics.set(i, topic);
                return;
            }
        }
    }

    public void deleteTopic(String id){
            topics.removeIf(t -> t.getId().equals(id));
    }

}

