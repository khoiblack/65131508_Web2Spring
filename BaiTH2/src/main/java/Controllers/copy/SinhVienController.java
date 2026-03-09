package Controllers.copy; 

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // Chú ý import đúng class Model này
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SinhVienController {

    @GetMapping("/thongtin")
    public String hienThiThongTin(Model model) {
        
        
        model.addAttribute("mssv", "65131508");
        model.addAttribute("hoTen", "Cái Trần Đăng Khôi");
        model.addAttribute("namSinh", 2005); 
        model.addAttribute("gioiTinh", "Nam");

        
        return "thongtin"; 
    }
}