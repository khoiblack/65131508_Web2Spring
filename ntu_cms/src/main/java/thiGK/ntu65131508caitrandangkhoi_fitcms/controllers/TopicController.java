package thiGK.ntu65131508caitrandangkhoi_fitcms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import thiGK.ntu65131508caitrandangkhoi_fitcms.models.Topic;
import thiGK.ntu65131508caitrandangkhoi_fitcms.repositories.TopicRepository;

@Controller
public class TopicController {

    // Gọi "chiếc đũa thần" JPA ra để dùng
    @Autowired
    private TopicRepository topicRepository;

    // 1. HIỆN DANH SÁCH (Lấy từ Database)
    @GetMapping("/topic/all")
    public String listTopics(Model model) {
        // topicRepository.findAll() sẽ tự động chạy câu lệnh SELECT * FROM topic
        model.addAttribute("dsTopic", topicRepository.findAll());
        return "topic-list"; 
    }

    // 2. MỞ FORM THÊM MỚI (Giữ nguyên)
    @GetMapping("/topic/new")
    public String showAddForm(Model model) {
        model.addAttribute("topic", new Topic());
        return "topic-addnew"; 
    }

    // 3. LƯU DỮ LIỆU VÀO DATABASE
    @PostMapping("/topic/save")
    public String saveTopic(Topic topic) {
        // topicRepository.save() sẽ tự động chạy lệnh INSERT INTO topic...
        topicRepository.save(topic);
        return "redirect:/topic/all";
    }

    
    @GetMapping("/topic/view/{id}")
    public String viewTopic(@PathVariable("id") String id, Model model) {
        
        Topic foundTopic = topicRepository.findById(id).orElse(null);
        model.addAttribute("topic", foundTopic);
        return "topic-view"; 
    }

    
    @GetMapping("/topic/delete/{id}")
    public String deleteTopic(@PathVariable("id") String id) {
        
        topicRepository.deleteById(id);
        return "redirect:/topic/all";
    }
}