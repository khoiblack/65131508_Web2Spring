package thiGK.ntu65131508caitrandangkhoi_fitcms.controllers;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import thiGK.ntu65131508caitrandangkhoi_fitcms.models.ExampleDataTopic;
import thiGK.ntu65131508caitrandangkhoi_fitcms.models.Topic; 

@Controller
public class TopicController {

    
    @GetMapping("/topic/all")
    public String listTopics(Model model) {
        
        
        model.addAttribute("dsTopic", ExampleDataTopic.topics);
        
        return "topic-list"; 
    }
 
    @GetMapping("/topic/new")
    public String showAddForm(Model model) {
        
        model.addAttribute("topic", new Topic());
        return "topic-addnew"; 
    }

    
    @PostMapping("/topic/save")
    public String saveTopic(Topic topic) {
        
        ExampleDataTopic.topics.add(topic);
        
        
        return "redirect:/topic/all";
    }
 
    @GetMapping("/topic/view/{id}")
    public String viewTopic(@PathVariable("id") String id, Model model) {
        
        
        Topic foundTopic = null;
        
        
        for (Topic t : ExampleDataTopic.topics) {
            
            if (t.getId().equals(id)) {
                foundTopic = t; 
                break; 
            }
        }
        
        
        model.addAttribute("topic", foundTopic);
        
        return "topic-view"; 
    }
 
    @GetMapping("/topic/delete/{id}")
    public String deleteTopic(@PathVariable("id") String id) {
        
        
        ExampleDataTopic.topics.removeIf(t -> t.getId().equals(id));
        
        
        return "redirect:/topic/all";
    }
}
