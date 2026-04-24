package thigk2.caitrandangkhoi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import thigk2.caitrandangkhoi.models.Tin;

public interface TinRepository extends JpaRepository<Tin, Integer> {
    
    List<Tin> findByTheLoaiTin_Id(Integer id); 
}