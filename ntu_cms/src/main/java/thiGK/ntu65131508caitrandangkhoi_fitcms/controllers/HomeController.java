package thiGK.ntu65131508caitrandangkhoi_fitcms.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/dashboard")
	public String dashBoard() {
		return "home";
	}
}