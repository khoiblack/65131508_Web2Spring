package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; 
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class B2_TruyenDuLieuSangView {

    @GetMapping("/bai2")
    public String hienThiThongTin(Model model) {
        
        
        model.addAttribute("mssv", "65131508");
        model.addAttribute("hoTen", "Cái Trần Đăng Khôi");
        model.addAttribute("namSinh", 2005); 
        model.addAttribute("gioiTinh", "Nam");

        
        return "bai2"; 
    }
}