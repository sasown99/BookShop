package BookShop.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import BookShop.Dao.SachDao;

@Controller
public class ProductController {
	@Autowired
	SachDao sachDao;
	
	@RequestMapping(value = {"/san-pham"})
	public ModelAndView Product() {
		ModelAndView mv = new ModelAndView("product/Product");
		mv.addObject("listproduct",sachDao.findAll());
		mv.addObject("listLoaiSach",sachDao.selectLoaiSach());
		return mv;
	}
	

	@RequestMapping(value = {"/chi-tiet-san-pham/{id}"})
	public ModelAndView ProductDetails(@PathVariable int id) {	
		ModelAndView mv = new ModelAndView("product/ProductDetails");
		 mv.addObject("detailProduct",sachDao.selectDetailBook(id)); 
		return mv;
	}
	
	@RequestMapping(value = {"/san-pham-type/{id}"})
	public ModelAndView Product_Type(@PathVariable int id) {
		ModelAndView mv = new ModelAndView("product/Product");
		mv.addObject("listproduct",sachDao.findProduct(id));
		mv.addObject("listLoaiSach",sachDao.selectLoaiSach());
		return mv;
	}

	
}
