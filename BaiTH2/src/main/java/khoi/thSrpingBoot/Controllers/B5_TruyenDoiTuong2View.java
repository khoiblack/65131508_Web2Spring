package khoi.thSrpingBoot.Controllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import khoi.thSrpingBoot.Model.SanPham;

@Controller
public class B5_TruyenDoiTuong2View {

    @GetMapping("/bai5")
    public String hienThiSanPham(Model model) {
        
        
        SanPham sp1 = new SanPham("LP001", "Laptop Dell XPS 15", 25500000.0, 10);
        
        
        model.addAttribute("sp", sp1);
        
        return "view-san-pham"; 
    }
}