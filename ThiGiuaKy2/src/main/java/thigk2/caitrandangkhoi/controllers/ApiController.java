package thigk2.caitrandangkhoi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import thigk2.caitrandangkhoi.models.TheLoaiTin;
import thigk2.caitrandangkhoi.models.Tin;
import thigk2.caitrandangkhoi.repositories.TheLoaiTinRepository;
import thigk2.caitrandangkhoi.repositories.TinRepository;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private TheLoaiTinRepository theLoaiRepo;

    @Autowired
    private TinRepository tinRepo;

    
    @GetMapping("/theloai")
    public List<TheLoaiTin> layDanhSachTheLoai() {
        return theLoaiRepo.findAll();
    }

    
    @GetMapping("/tin/theloai/{id}")
    public List<Tin> layTinTheoTheLoai(@PathVariable Integer id) {
        return tinRepo.findByTheLoaiTin_Id(id);
    }
}