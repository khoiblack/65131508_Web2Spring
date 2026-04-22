package ntu.khoi.services;

import ntu.khoi.models.TinTuc;
import ntu.khoi.repositories.TinTucRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TinTucService {

    @Autowired
    private TinTucRepository tinTucRepository;

    // 1. READ: Lấy tất cả tin tức (Đã làm)
    public List<TinTuc> layTatCaTinTuc() {
        return tinTucRepository.findAll();
    }

    // 2. CREATE & UPDATE: Lưu tin tức (Nếu có ID thì là Sửa, không có ID thì là Thêm mới)
    public void luuTinTuc(TinTuc tinTuc) {
        tinTucRepository.save(tinTuc);
    }

    // 3. Lấy ra 1 bản tin cụ thể theo ID (Dùng để hiển thị lên form lúc bấm nút Sửa)
    public TinTuc layTinTucTheoId(Integer id) {
        return tinTucRepository.findById(id).orElse(null);
    }

    // 4. DELETE: Xóa tin tức
    public void xoaTinTuc(Integer id) {
        tinTucRepository.deleteById(id);
    }
}