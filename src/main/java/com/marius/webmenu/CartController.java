package com.marius.webmenu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.marius.webapp.beans.Cart;

@Controller
public class CartController {

Cart cart = new Cart();
	
	@RequestMapping(value = "/cart/add/{productId}",method = RequestMethod.GET)
	
	public String addToCart(@PathVariable("productId") int productId, @RequestHeader("referer") String referedFrom) {

		  cart.addToCart(productId);
	   	 
	      return "redirect:" + referedFrom;
		
	}
	
	@RequestMapping(value = "/showcart",method = RequestMethod.GET)
	public String printProducts(ModelMap model) {

	      model.addAttribute("message", cart.getProductOrdered());
	      model.addAttribute("totalPrice", cart.showTotalSum());
	      model.addAttribute("checkOrder", cart.checkIfOrderIsOk());

	      return "cart";
		
	}
	
	@RequestMapping(value = "/deleteItem/{productId}",method = RequestMethod.GET)

	public String deleteCart(@PathVariable("productId") int productId, @RequestHeader("referer") String referedFrom) {

		  cart.deleteProduct(productId);
		  
	      return "redirect:" + referedFrom;
		
	}
	
	@RequestMapping(value = "/placeOrder",method = RequestMethod.GET)

	public String placeCart(ModelMap model) {
		
		cart.emptyCart();

	     return  "home";
		
	}
}
