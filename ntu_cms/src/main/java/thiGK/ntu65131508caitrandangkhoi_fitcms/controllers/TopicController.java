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
 // 3. Hàm này dùng để XEM CHI TIẾT một Topic dựa vào ID
    @GetMapping("/topic/view/{id}")
    public String viewTopic(@PathVariable("id") String id, Model model) {
        
        // Tạo một biến để chứa topic tìm được
        Topic foundTopic = null;
        
        // Dùng vòng lặp chạy qua toàn bộ danh sách ảo
        for (Topic t : ExampleDataTopic.topics) {
            // Nếu tìm thấy ID trùng khớp với ID trên đường dẫn
            if (t.getId().equals(id)) {
                foundTopic = t; // Lưu lại
                break; // Ngừng tìm kiếm
            }
        }
        
        // Gửi topic tìm được sang giao diện HTML với tên là "topic"
        model.addAttribute("topic", foundTopic);
        
        return "topic-view"; // Gọi file topic-view.html
    }
 // 4. Hàm này dùng để XÓA một Topic dựa vào ID
    @GetMapping("/topic/delete/{id}")
    public String deleteTopic(@PathVariable("id") String id) {
        
        // Cách nhanh nhất trong Java: Tìm trong danh sách ảo, nếu topic nào có ID trùng khớp thì xóa luôn
        ExampleDataTopic.topics.removeIf(t -> t.getId().equals(id));
        
        // Xóa xong thì tự động tải lại (redirect) về trang danh sách để thấy kết quả
        return "redirect:/topic/all";
    }
}
