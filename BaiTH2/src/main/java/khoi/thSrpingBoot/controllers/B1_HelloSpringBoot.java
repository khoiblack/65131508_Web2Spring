package khoi.thSrpingBoot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class B1_HelloSpringBoot {

    
    @GetMapping("/bai1") 
    public String index() {
        return "bai1"; 
    }
}
