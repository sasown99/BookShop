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
@Table(name = "loaisach")
public class LoaiSach {
	
	@Id
	@Column(name = "MaLoaiSach")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer maLoaiSach;
	
	@Column(name = "TenLoaiSach")
	private String tenLoaiSach;
	
    
	public Integer getMaLoaiSach() {
		return maLoaiSach;
	}

	public String getTenLoaiSach() {
		return tenLoaiSach;
	}

	public void setTenLoaiSach(String tenLoaiSach) {
		this.tenLoaiSach = tenLoaiSach;
	}

	
	
	
}