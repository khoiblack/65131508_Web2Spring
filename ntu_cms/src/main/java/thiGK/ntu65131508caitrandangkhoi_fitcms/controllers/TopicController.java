package thiGK.ntu65131508caitrandangkhoi_fitcms.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import thiGK.ntu65131508caitrandangkhoi_fitcms.models.ExampleData;
import thiGK.ntu65131508caitrandangkhoi_fitcms.models.Topic; 

@Controller
public class TopicController {

    
    @GetMapping("/topic/all")
    public String listTopics(Model model) {
        
        
        model.addAttribute("dsTopic", ExampleData.topics);
        
        return "topic-list"; 
    }
 
    @GetMapping("/topic/new")
    public String showAddForm(Model model) {
        
        model.addAttribute("topic", new Topic());
        return "topic-addnew"; 
    }

    
    @PostMapping("/topic/save")
    public String saveTopic(Topic topic) {
        
        ExampleData.topics.add(topic);
        
        
        return "redirect:/topic/all";
    }
}
