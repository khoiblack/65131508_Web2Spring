package ntu.khoi.controllers;

import ntu.khoi.services.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired
    private SanPhamService sanPhamService;

    @GetMapping("/")
    public String trangChu(Model model) {
        model.addAttribute("dsSanPham", sanPhamService.layTatCa());
        return "index"; 
    }
}