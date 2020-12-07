//package BookShop.Dao;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//import javax.persistence.Query;
//
//import org.springframework.stereotype.Repository;
//
//import BookShop.Entity.Sach;
//
//@Repository
//public class SachDao {
//	static EntityManagerFactory factory;
//	static EntityManager entityManager;
//	
//	public List<Sach> query(String jpa) {
//		begin();
//		Query query = entityManager.createQuery(jpa);
//		@SuppressWarnings("unchecked")
//		List<Sach> listBooks = query.getResultList();
//		end();
//		return listBooks;
//	}
//	
//	public Sach find(Integer id) {
//		begin();
//		Sach book = entityManager.find(Sach.class, id);
//		end();
//		return book;
//	}
//	
//	public Sach update(Sach sach) {
//		begin();
//		Sach existBook = entityManager.find(Sach.class, sach.getMaSach());
//		if(existBook == null) return null;
//		
//		existBook.setTenSach(sach.getTenSach());
//	    existBook.setReview(sach.getReview());
//	    existBook.setGia(sach.getGia());
//	    existBook.setNamXB(sach.getNamXB());
//	    existBook.setSoLuong(sach.getSoLuong());
//	    
//	    entityManager.merge(existBook);
//	    end();
//	    return existBook;
//	}
//	
//	public Sach create(Sach sach) {  
//		begin();
//		Sach newBook = new Sach();
//		newBook.setTenSach(sach.getTenSach());
//		newBook.setReview(sach.getReview());
//		newBook.setGia(sach.getGia());
//		newBook.setNamXB(sach.getNamXB());
//		newBook.setSoLuong(sach.getSoLuong());
//		newBook.setLoaiSach(sach.getLoaiSach());
//		newBook.setAnh(sach.getAnh());
//		newBook.setNhaXB(sach.getNhaXB());
//	    entityManager.persist(sach);
//	    end();
//	    return newBook;
//	}
//	
//	private static void end() {
//		entityManager.getTransaction().commit();
//	    entityManager.close();
//	    factory.close();
//	}
//	
//	private static void begin() {
//		factory = Persistence.createEntityManagerFactory("persistence-data");
//		entityManager = factory.createEntityManager();
//		entityManager.getTransaction().begin();
//	}
//
//
//}
//

package BookShop.Dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import BookShop.Entity.Sach;

@Repository(value = "SachDao")
@Transactional(rollbackFor = Exception.class)
public class SachDao {
	@PersistenceContext
	private EntityManager entityManager;

	public void persist(final Sach customer) {
		entityManager.persist(customer);
	}

	public Sach findById(final int id) {
		return entityManager.find(Sach.class, id);
	}

	public void delete(final Sach customer) {
		entityManager.remove(customer);
	}

	public List<Sach> findAll() {
		return entityManager.createQuery("Select s From Sach s Where s.soLuong > 0", Sach.class).getResultList();
	}

}
