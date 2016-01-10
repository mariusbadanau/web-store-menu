package com.marius.webmenu;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.marius.webapp.beans.Product;

import com.marius.webapp.beans.ProdusBuilderPizza;

@Controller
public class PizzaController {

ProdusBuilderPizza buildProducts = new ProdusBuilderPizza();
	
	@RequestMapping(value = "/pizza", method = RequestMethod.GET)
	public String getPtoduct (ModelMap model) {	
		
		
		List<Product> produse = buildProducts.createProducts();
		model.addAttribute("message", produse);
		return "pizza";
	}
	
	
}
