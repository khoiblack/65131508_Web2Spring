package thigk2.caitrandangkhoi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import thigk2.caitrandangkhoi.repositories.TheLoaiTinRepository;
import thigk2.caitrandangkhoi.repositories.TinRepository;

@Controller
public class HomeController {

    @Autowired
    private TinRepository tinRepo;
    
    @Autowired
    private TheLoaiTinRepository theLoaiRepo;

    
    @GetMapping("/")
    public String trangChu(Model model) {
        model.addAttribute("dsTheLoai", theLoaiRepo.findAll());
        model.addAttribute("dsTin", tinRepo.findAll());
        return "index";
    }

    
    @GetMapping("/theloai/{id}")
    public String tinTheoTheLoai(@PathVariable Integer id, Model model) {
        model.addAttribute("dsTheLoai", theLoaiRepo.findAll());
        model.addAttribute("dsTin", tinRepo.findByTheLoaiTin_Id(id));
        return "index";
    }

    
    @GetMapping("/tin/{id}")
    public String chiTietTin(@PathVariable Integer id, Model model) {
        model.addAttribute("tin", tinRepo.findById(id).orElse(null));
        return "chitiet";
    }
}