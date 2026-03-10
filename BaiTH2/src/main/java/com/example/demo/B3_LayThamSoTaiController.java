package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class B3_LayThamSoTaiController {

    @GetMapping("/bai3")
    public String nhanDuLieu(
            
            @RequestParam(name = "tenNguoiDung", required = false, defaultValue = "") String ten, 
            Model model) {
        
        
        if (!ten.isEmpty()) {
            model.addAttribute("msg", "Xin chào bạn " + ten + " đã gửi dữ liệu thành công!");
        } else {
            model.addAttribute("msg", "Vui lòng nhập tên của bạn ở ô phía trên.");
        }
        
        
        return "bai3"; 
    }
}