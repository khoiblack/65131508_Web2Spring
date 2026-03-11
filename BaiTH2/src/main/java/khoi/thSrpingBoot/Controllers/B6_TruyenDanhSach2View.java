package khoi.thSrpingBoot.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import khoi.thSrpingBoot.Model.SanPham; 

@Controller
public class B6_TruyenDanhSach2View {

    @GetMapping("/bai6")
    public String hienThiDanhSach(Model model) {
        
        
        List<SanPham> listSP = new ArrayList<>();

        
        listSP.add(new SanPham("SP001", "Laptop Dell XPS 15", 25000000.0, 10));
        listSP.add(new SanPham("SP002", "Chuột không dây Logitech", 1200000.0, 50));
        listSP.add(new SanPham("SP003", "Bàn phím cơ Keychron", 1800000.0, 20));
        listSP.add(new SanPham("SP004", "Màn hình LG 27 inch 4K", 8500000.0, 5));
        listSP.add(new SanPham("SP005", "Tai nghe Sony WH-1000XM5", 7000000.0, 15));

        
        model.addAttribute("dsSanPham", listSP);

        return "bai6"; 
    }
}