package thigk2.caitrandangkhoi.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class TheLoaiTin {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String tenTheLoai;

    @JsonIgnore
    @OneToMany(mappedBy = "theLoaiTin")
    private List<Tin> dsTin;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTenTheLoai() {
		return tenTheLoai;
	}

	public void setTenTheLoai(String tenTheLoai) {
		this.tenTheLoai = tenTheLoai;
	}

	public List<Tin> getDsTin() {
		return dsTin;
	}

	public void setDsTin(List<Tin> dsTin) {
		this.dsTin = dsTin;
	}
    
    
    
}