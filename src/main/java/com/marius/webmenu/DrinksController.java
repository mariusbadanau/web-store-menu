package com.marius.webmenu;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.marius.webapp.beans.Product;
import com.marius.webapp.beans.ProdusBuilderDrinks;

@Controller
public class DrinksController {
	
	ProdusBuilderDrinks buildProducts = new ProdusBuilderDrinks();
	
	@RequestMapping(value = "/drinks", method = RequestMethod.GET)
	public String getPtoduct (ModelMap model) {	
		
		
		List<Product> produse = buildProducts.createProducts();
		model.addAttribute("message", produse);
		return "drinks";
	}
	


}

