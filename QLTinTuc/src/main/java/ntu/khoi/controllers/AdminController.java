package ntu.khoi.controllers;

import ntu.khoi.models.TinTuc;
import ntu.khoi.repositories.LoaiTinRepository;
import ntu.khoi.services.TinTucService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin/tintuc")
public class AdminController {

    @Autowired
    private TinTucService tinTucService;

    @Autowired
    private LoaiTinRepository loaiTinRepository; // Dùng để đổ dữ liệu vào thẻ <select>

    // 1. Giao diện Danh sách tin tức
    @GetMapping
    public String danhSachTinTuc(Model model) {
        model.addAttribute("dsTinTuc", tinTucService.layTatCaTinTuc());
        return "admin/tin_tuc_list"; // Dẫn tới file tin_tuc_list.html
    }

    // 2. Giao diện Form Thêm mới
    @GetMapping("/them")
    public String formThem(Model model) {
        model.addAttribute("tinTuc", new TinTuc()); // Gửi một đối tượng rỗng ra form
        model.addAttribute("dsLoaiTin", loaiTinRepository.findAll()); // Gửi danh sách loại tin để chọn
        return "admin/tin_tuc_form";
    }

    // 3. Giao diện Form Sửa (Lấy dữ liệu cũ đắp lên form)
    @GetMapping("/sua/{id}")
    public String formSua(@PathVariable Integer id, Model model) {
        model.addAttribute("tinTuc", tinTucService.layTinTucTheoId(id));
        model.addAttribute("dsLoaiTin", loaiTinRepository.findAll());
        return "admin/tin_tuc_form";
    }

    // 4. Xử lý nút LƯU (Dùng chung cho cả Thêm và Sửa)
    @PostMapping("/luu")
    public String luuTinTuc(@ModelAttribute("tinTuc") TinTuc tinTuc) {
        tinTucService.luuTinTuc(tinTuc);
        return "redirect:/admin/tintuc"; // Lưu xong thì quay về trang danh sách
    }

    // 5. Xử lý nút XÓA
    @GetMapping("/xoa/{id}")
    public String xoaTinTuc(@PathVariable Integer id) {
        tinTucService.xoaTinTuc(id);
        return "redirect:/admin/tintuc"; // Xóa xong quay về trang danh sách
    }
}