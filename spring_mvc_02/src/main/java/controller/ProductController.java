package controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ProductController {
	
	@RequestMapping("product/productForm")
	public String productFormView() {
		return "product/productForm";
	}
	
	@RequestMapping("product/newProduct")
	public String insertProduct(HttpServletRequest request, Model model) {
		String prdNo = request.getParameter("prdNo");
		String prdName = request.getParameter("prdName");
		String prdPrice = request.getParameter("prdPrice");
		String prdMaker = request.getParameter("prdMaker");
		String prdDate = request.getParameter("prdDate");
		String prdQty = request.getParameter("prdQty");
		
		model.addAttribute("prdNo",prdNo);
		model.addAttribute("prdName",prdName);
		model.addAttribute("prdPrice",prdPrice);
		model.addAttribute("prdMaker",prdMaker);
		model.addAttribute("prdDate",prdDate);
		model.addAttribute("prdQty",prdQty);
		
		return "product/productResult";
	}
	@RequestMapping("product/newProduct2")
	public String insertProduct2(@RequestParam("prdNo") String prdNo,
								 @RequestParam("prdName") String prdName,
								 @RequestParam("prdPrice") String prdPrice,
								 @RequestParam("prdMaker") String prdMaker,
								 @RequestParam("prdDate") String prdDate,
								 @RequestParam("prdQty") String prdQty,
								 Model model) {

		model.addAttribute("prdNo",prdNo);
		model.addAttribute("prdName",prdName);
		model.addAttribute("prdPrice",prdPrice);
		model.addAttribute("prdMaker",prdMaker);
		model.addAttribute("prdDate",prdDate);
		model.addAttribute("prdQty",prdQty);

		return "product/productResult";
	}
	@RequestMapping("product/newProduct3")
	public String insertProduct3(Product product) {
		return "product/productCmdResult";
	}
}