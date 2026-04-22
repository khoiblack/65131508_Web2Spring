package ntu.khoi.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tin_tuc") 
public class TinTuc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "tieu_de")
    private String tieuDe;
    
    @Column(name = "noi_dung", columnDefinition = "TEXT")
    private String noiDung;

    @ManyToOne
    @JoinColumn(name = "loai_tin_id") // Khớp với khóa ngoại trong MySQL
    private LoaiTin loaiTin;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTieuDe() {
		return tieuDe;
	}

	public void setTieuDe(String tieuDe) {
		this.tieuDe = tieuDe;
	}

	public String getNoiDung() {
		return noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}

	public LoaiTin getLoaiTin() {
		return loaiTin;
	}

	public void setLoaiTin(LoaiTin loaiTin) {
		this.loaiTin = loaiTin;
	}

    // TODO: Nhấp chuột phải -> Source -> Generate Getters and Setters -> Chọn Select All -> Generate!
    
}