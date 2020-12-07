package BookShop.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "nhaxuatban")
public class NhaXuatBan {
	
	@Id
	@Column(name = "MaNXB")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer maNXB;
	
	@Column(name = "TenNXB")
	private String tenNXB;
	
	@Column(name = "GhiChu")
	private String ghiChu;
	
	@Column(name = "Email")
	private String email;
	

	public Integer getMaNXB() {
		return maNXB;
	}

	public String getTenNXB() {
		return tenNXB;
	}

	public void setTenNXB(String tenNXB) {
		this.tenNXB = tenNXB;
	}

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	
	
	
}