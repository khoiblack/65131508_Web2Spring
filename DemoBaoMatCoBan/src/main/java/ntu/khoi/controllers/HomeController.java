package ntu.khoi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
    // test nguoi dung thong thuong
    @GetMapping("/products")
    public String indexP() {
        return "sanpham";
    }
    // test user quan tri
    @GetMapping("/admincp")
    public String indexAd() {
        return "indexAdmin";
    }
    @GetMapping("/login")
    public String getLogin(){
        return "login";
    }
    
}