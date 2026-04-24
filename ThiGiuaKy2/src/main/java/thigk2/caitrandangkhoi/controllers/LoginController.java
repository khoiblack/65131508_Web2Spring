package thigk2.caitrandangkhoi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;
import thigk2.caitrandangkhoi.models.NguoiDung;
import thigk2.caitrandangkhoi.repositories.NguoiDungRepository;

@Controller
public class LoginController {

    @Autowired
    private NguoiDungRepository nguoiDungRepo;

    @GetMapping("/login")
    public String trangDangNhap() {
        return "login";
    }

    @PostMapping("/login")
    public String xuLyDangNhap(@RequestParam String username, 
                               @RequestParam String password, 
                               HttpSession session, 
                               Model model) {
        NguoiDung nd = nguoiDungRepo.findByUsername(username);
        if (nd != null && nd.getPassword().equals(password)) {
            session.setAttribute("USER", nd.getUsername());
            return "redirect:/"; 
        }
        model.addAttribute("error", "Sai tài khoản hoặc mật khẩu");
        return "login";
    }
    
    @GetMapping("/logout")
    public String dangXuat(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
}