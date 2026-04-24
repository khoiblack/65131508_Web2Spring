package thigk2.caitrandangkhoi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import thigk2.caitrandangkhoi.models.NguoiDung;

public interface NguoiDungRepository extends JpaRepository<NguoiDung, Integer> {
    NguoiDung findByUsername(String username); 
}