package BookShop.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import BookShop.Dao.SachDao;
import BookShop.Entity.Sach;

@Service
@Transactional
public class SachService {
  @Autowired
  private SachDao sachDao;
  
  public List<Sach> findAll() {
    return sachDao.findAll();
  }
  public Sach findById(final int id) {
    return sachDao.findById(id);
  }
  public void save(final Sach sach) {
    // check if sach exist -> throw exception
    sachDao.persist(sach);
  }
  public void update(final Sach sach) {
    // if sachDB = null -> throw Exception
    Sach sachDB = sachDao.findById(sach.getMaSach());
    sachDB.setTenSach(sach.getTenSach());
    sachDB.setReview(sach.getReview());
    sachDB.setGia(sach.getGia());
    sachDB.setAnh(sach.getAnh());
    sachDB.setNamXB(sach.getNamXB());   
    sachDao.persist(sachDB);
  }
  public void delete(final int id) {
    Sach sach = sachDao.findById(id);
    if (sach != null) {
      sachDao.delete(sach);
    }
  }
}