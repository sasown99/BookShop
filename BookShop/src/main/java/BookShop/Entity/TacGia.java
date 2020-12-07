package BookShop.Entity;

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
@Table(name = "tacgia")
public class TacGia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private 	Integer     MaTG ;
	private    String  TenTG ;
	private    String  QueQuan ;
	private   String    Email;
	
	public int getMaTG() {
		return MaTG;
	}
	public void setMaTG(int maTG) {
		MaTG = maTG;
	}
	public String getTenTG() {
		return TenTG;
	}
	public void setTenTG(String tenTG) {
		TenTG = tenTG;
	}
	public String getQueQuan() {
		return QueQuan;
	}
	public void setQueQuan(String queQuan) {
		QueQuan = queQuan;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
}
