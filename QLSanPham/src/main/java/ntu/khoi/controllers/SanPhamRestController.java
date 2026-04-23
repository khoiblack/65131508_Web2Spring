package ntu.khoi.controllers;

import ntu.khoi.models.SanPham;
import ntu.khoi.services.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/sanpham")
public class SanPhamRestController {
    @Autowired
    private SanPhamService sanPhamService;

    @GetMapping
    public List<SanPham> apiLayDanhSach() {
        return sanPhamService.layTatCa();
    }
}