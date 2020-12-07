package BookShop.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
		return mv;
	}
	
	@RequestMapping(value = {"/chi-tiet-san-pham"})
	public ModelAndView ProductDetails() {
		ModelAndView mv = new ModelAndView("product/ProductDetails");
		return mv;
	}
	
}
