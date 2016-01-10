package com.marius.webapp.beans;

import java.util.ArrayList;
import java.util.List;

public class ProdusBuilderDrinks {

	
	public List<Product> createProducts() {
		
	    List<Product> products = new ArrayList<Product>();
		Product product = new Product();
		
		product.setId(7);
		product.setName("Coca Cola");
		product.setProductType("Drink");
		product.setDescription("Soda");
		product.setImagePath("resources/img/drinks/images.jpg");
		product.setPrice(4);
		product.setQty(1);
		
		products.add(product);
		
		product = new Product();
		
		product.setId(8);
		product.setName("Jack Daniel's");
		product.setProductType("Drink");
		product.setDescription("Alcohool");
		product.setImagePath("resources/img/drinks/jack.jpg");
		product.setPrice(10);
		product.setQty(1);
		
		products.add(product);
		
		product = new Product();
		product.setId(9);
		product.setName("Guiness");
		product.setProductType("Drink");
		product.setDescription("Beer");
		product.setImagePath("resources/img/drinks/guines.png");
		product.setPrice(7);
		product.setQty(1);
		
		products.add(product);
		
		product = new Product();
		
		product.setId(10);
		product.setName("Pepsi");
		product.setProductType("Drink");
		product.setDescription("Soda");
		product.setImagePath("resources/img/drinks/pepsi.jpg");
		product.setPrice(4);
		product.setQty(1);
		
		products.add(product);

		product = new Product();
		
		product.setId(11);
		product.setName("Mirinda");
		product.setProductType("Drink");
		product.setDescription("Soda");
		product.setImagePath("resources/img/drinks/mirinda1.jpg");
		product.setPrice(4);
		product.setQty(1);
		
		products.add(product);
		
		product = new Product();
		
		product.setId(12);
		product.setName("Heineken");
		product.setProductType("Drink");
		product.setDescription("Bear");
		product.setImagePath("resources/img/drinks/preview-heineken.png");
		product.setPrice(7);
		product.setQty(1);
		
		products.add(product);
		
product = new Product();
		
		product.setId(16);
		product.setName("Coffe");
		product.setProductType("Drink");
		product.setDescription("caffe");
		product.setImagePath("resources/img/drinks/cofffe.jpg");
		product.setPrice(6);
		product.setQty(1);
		
		products.add(product);
		
product = new Product();
		
		product.setId(17);
		product.setName("Caffe Crema");
		product.setProductType("Drink");
		product.setDescription("caffe");
		product.setImagePath("resources/img/drinks/Cafcr.jpg");
		product.setPrice(6);
		product.setQty(1);
		
		products.add(product);
		
		return products;
	}
}
