package ntu.khoi.controllers;

import ntu.khoi.services.TinTucService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private TinTucService tinTucService;

    // Đường dẫn trang chủ
    @GetMapping("/")
    public String trangChu(ModelMap model) {
        // Lấy danh sách tin từ Service
        var danhSachTin = tinTucService.layTatCaTinTuc();
        
        // Đóng gói gửi ra ngoài giao diện với cái tên là "dsTinTuc"
        model.addAttribute("dsTinTuc", danhSachTin);
        
        // Trả về file index.html
        return "index";
    }
}