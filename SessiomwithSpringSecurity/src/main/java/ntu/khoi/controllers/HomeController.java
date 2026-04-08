package ntu.khoi.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Authentication authentication, ModelMap m) {
        // Kiểm tra xem có ai đang đăng nhập không
        if (authentication != null) {
            // Lấy tên tài khoản nhét vào cái biến tên là "au" để gửi ra màn hình
            m.addAttribute("au", authentication.getName());
        }
        return "home";
    }

    // Đã xóa hàm @GetMapping("/login") vì chúng ta dùng form mặc định của Spring
}