package BookShop.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "binhluan")
public class BinhLuan implements Serializable{
	@Id
	private  int    MaKH ;
	@Id
	private   int    MaSach ;
	private    String   NoiDungBL ;
	private    String   DanhGia;
	public int getMaKH() {
		return MaKH;
	}
	public void setMaKH(int maKH) {
		MaKH = maKH;
	}
	public int getMaSach() {
		return MaSach;
	}
	public void setMaSach(int maSach) {
		MaSach = maSach;
	}
	public String getNoiDungBL() {
		return NoiDungBL;
	}
	public void setNoiDungBL(String noiDungBL) {
		NoiDungBL = noiDungBL;
	}
	public String getDanhGia() {
		return DanhGia;
	}
	public void setDanhGia(String danhGia) {
		DanhGia = danhGia;
	}
	
	
}
