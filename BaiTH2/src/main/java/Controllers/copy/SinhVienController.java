package Controllers.copy; // Đảm bảo đúng tên package của bạn

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // Chú ý import đúng class Model này
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SinhVienController {

    @GetMapping("/thongtin")
    public String hienThiThongTin(Model model) {
        
        // 1. Dùng model.addAttribute("tên_biến", "giá_trị") để truyền dữ liệu
        model.addAttribute("mssv", "65131508");
        model.addAttribute("hoTen", "Cái Trần Đăng Khôi");
        model.addAttribute("namSinh", 2005); 
        model.addAttribute("gioiTinh", "Nam");

        // 2. Trả về tên của file giao diện (không cần đuôi .html)
        return "thongtin"; 
    }
}