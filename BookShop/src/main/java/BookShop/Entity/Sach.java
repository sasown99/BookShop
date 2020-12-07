package BookShop.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sach")
public class Sach {
	
	@Id
	@Column(name = "MaSach")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer maSach;
	
	@Column(name = "TenSach")
	private String tenSach;
	
	@Column(name = "Review")
	private String review;
	
	@Column(name = "Gia")
	private Integer gia;
	
	@Column(name = "SoLuong")
	private Integer soLuong;
	
	@Column(name = "Anh")
	private String anh;
	
	@Column(name = "NamXB")
	private Integer namXB;
	
	@Column(name = "MaNXB")
	private Integer maNXB;
	
	@Column(name = "MaLoaiSach")
	private Integer maLoaiSach;
	
	

	
	public Integer getMaNXB() {
		return maNXB;
	}



	public void setMaNXB(Integer maNXB) {
		this.maNXB = maNXB;
	}



	public Integer getMaLoaiSach() {
		return maLoaiSach;
	}



	public void setMaLoaiSach(Integer maLoaiSach) {
		this.maLoaiSach = maLoaiSach;
	}



	public Integer getMaSach() {
		return maSach;
	}
	
	

	public void setMaSach(Integer maSach) {
		this.maSach = maSach;
	}



	public String getTenSach() {
		return tenSach;
	}

	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public Integer getGia() {
		return gia;
	}

	public void setGia(Integer gia) {
		this.gia = gia;
	}

	public Integer getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(Integer soLuong) {
		this.soLuong = soLuong;
	}

	public String getAnh() {
		return anh;
	}

	public void setAnh(String anh) {
		this.anh = anh;
	}

	public Integer getNamXB() {
		return namXB;
	}

	public void setNamXB(Integer namXB) {
		this.namXB = namXB;
	}


	
	
}