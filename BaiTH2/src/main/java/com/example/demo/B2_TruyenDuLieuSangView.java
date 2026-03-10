package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class B2_TruyenDuLieuSangView {

    
    @GetMapping("/bai1") 
    public String index() {
        return "index"; 
    }
}
