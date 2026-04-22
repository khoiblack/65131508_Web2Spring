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

    // Hàm này sẽ gom toàn bộ tin tức có trong database trả về
    public List<TinTuc> layTatCaTinTuc() {
        return tinTucRepository.findAll();
    }
}