package ntu.khoi.controllers;

import ntu.khoi.models.SanPham;
import ntu.khoi.repositories.LoaiSanPhamRepository;
import ntu.khoi.services.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin/sanpham") // Tất cả các đường dẫn trong này đều bắt đầu bằng /admin/sanpham
public class AdminController {

    @Autowired
    private SanPhamService sanPhamService;

    @Autowired
    private LoaiSanPhamRepository loaiSpRepo;

    // 1. Hiển thị danh sách sản phẩm (READ)
    @GetMapping
    public String danhSach(Model model) {
        model.addAttribute("dsSanPham", sanPhamService.layTatCa());
        return "admin/san_pham_list";
    }

    // 2. Hiển thị form thêm mới sản phẩm (CREATE - GET)
    @GetMapping("/them")
    public String formThem(Model model) {
        model.addAttribute("sanPham", new SanPham()); // Tạo đối tượng rỗng để hứng dữ liệu từ form
        model.addAttribute("dsLoai", loaiSpRepo.findAll()); // Lấy danh sách loại để hiện trong thẻ <select>
        return "admin/san_pham_form";
    }

    // 3. Hiển thị form sửa sản phẩm (UPDATE - GET)
    @GetMapping("/sua/{id}")
    public String formSua(@PathVariable Integer id, Model model) {
        SanPham sp = sanPhamService.layTheoId(id);
        if (sp != null) {
            model.addAttribute("sanPham", sp);
            model.addAttribute("dsLoai", loaiSpRepo.findAll());
            return "admin/san_pham_form";
        }
        return "redirect:/admin/sanpham"; // Nếu không tìm thấy ID thì quay về danh sách
    }

    // 4. Xử lý lưu dữ liệu (Dùng chung cho cả Thêm và Sửa - POST)
    @PostMapping("/luu")
    public String luu(@ModelAttribute("sanPham") SanPham sanPham) {
        sanPhamService.luu(sanPham);
        return "redirect:/admin/sanpham"; // Lưu xong quay về trang danh sách
    }

    // 5. Xử lý xóa sản phẩm (DELETE)
    @GetMapping("/xoa/{id}")
    public String xoa(@PathVariable Integer id) {
        sanPhamService.xoa(id);
        return "redirect:/admin/sanpham";
    }
}