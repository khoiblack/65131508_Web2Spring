package ntu.khoi.repositories;

import ntu.khoi.models.TinTuc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TinTucRepository extends JpaRepository<TinTuc, Integer> {
}