package ntu.khoi.controllers;

import ntu.khoi.models.TinTuc;
import ntu.khoi.services.TinTucService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/tintuc")
public class TinTucRestController {

    @Autowired
    private TinTucService tinTucService;

    // Khi có ai gọi vào /api/tintuc, hệ thống sẽ trả về danh sách JSON
    @GetMapping
    public List<TinTuc> layDanhSachAPI() {
        return tinTucService.layTatCaTinTuc();
    }
}