package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class B3_LayThamSoTaiController {
	@GetMapping("/bai3")
	public String welcome(@RequestParam(name = "name", required = false, defaultValue = "Khách") String hoTen,
			ModelMap model) {
		model.addAttribute("msg", "Chào mừng " + hoTen + " đến với Spring Boot!");
		return "bai3";
	}

}

