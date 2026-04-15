package ntu.khoi.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "loai_tin") // Phải khớp với tên bảng trong MySQL
public class LoaiTin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten_loai")
    private String tenLoai;

    @OneToMany(mappedBy = "loaiTin", cascade = CascadeType.ALL)
    private List<TinTuc> danhSachTinTuc;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTenLoai() {
		return tenLoai;
	}

	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}

	public List<TinTuc> getDanhSachTinTuc() {
		return danhSachTinTuc;
	}

	public void setDanhSachTinTuc(List<TinTuc> danhSachTinTuc) {
		this.danhSachTinTuc = danhSachTinTuc;
	}

    // TODO: Bạn nhấp chuột phải -> Source -> Generate Getters and Setters -> Chọn Select All -> Generate nhé!
    
}