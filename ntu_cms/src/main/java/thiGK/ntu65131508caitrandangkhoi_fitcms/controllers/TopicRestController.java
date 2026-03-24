package thiGK.ntu65131508caitrandangkhoi_fitcms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import thiGK.ntu65131508caitrandangkhoi_fitcms.models.Topic;
import thiGK.ntu65131508caitrandangkhoi_fitcms.repositories.TopicRepository; // Nhớ import Repository

// 1. Dùng @RestController thay vì @Controller để báo cho Spring Boot biết mình muốn trả về JSON
@RestController
// 2. Đặt đường dẫn gốc giống hệt cấu trúc ảnh mẫu của bạn
@RequestMapping("/restAPI/topic")
public class TopicRestController {

    // Gọi kho dữ liệu MySQL của bạn ra
    @Autowired
    private TopicRepository topicRepository;

    // 3. Nối thêm "/all" -> Tổng đường dẫn sẽ là: /restAPI/topic/all
    @GetMapping("/all")
    public List<Topic> getAllTopicsAPI() {
        
        // 4. Chỉ cần 1 lệnh duy nhất! Lấy toàn bộ dữ liệu từ Database đưa cho Spring Boot tự dịch ra JSON
        return topicRepository.findAll();
        
    }
}