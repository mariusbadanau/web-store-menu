package com.marius.webapp.beans;

import java.util.ArrayList;
import java.util.List;

public class ProdusBuilderPizza {

public List<Product> createProducts() {
		
	    List<Product> products = new ArrayList<Product>();
		Product product = new Product();
		
		product.setId(1);
		product.setName("Piza de pui");
		product.setProductType("pizza");
		product.setDescription("cu de toate");
		product.setImagePath("resources/img/pizza/img1.jpg");
		product.setPrice(15);
		product.setQty(1);
		
		products.add(product);
		
		product = new Product();
		
		product.setId(2);
		product.setName("Pizza al Chef");
		product.setProductType("pizza");
		product.setDescription("");
		product.setImagePath("resources/img/pizza/pz-alchef.jpg");
		product.setPrice(10);
		product.setQty(1);
		
		products.add(product);
		
		product = new Product();
		product.setId(3);
		product.setName("Pizza Bonito");
		product.setProductType("pizza");
		product.setDescription("cu de toate");
		product.setImagePath("resources/img/pizza/pz-bonito.jpg");
		product.setPrice(13);
		product.setQty(1);
		
		products.add(product);
		
		product = new Product();
		
		product.setId(4);
		product.setName("Pizza home");
		product.setProductType("pizza");
		product.setDescription("cu de toate");
		product.setImagePath("resources/img/pizza/pz-casa.jpg");
		product.setPrice(10);
		product.setQty(1);
		
		products.add(product);
		
		product = new Product();
		
		product.setId(5);
		product.setName("Pizza delux");
		product.setProductType("pizza");
		product.setDescription("cu de toate");
		product.setImagePath("resources/img/pizza/pz-delux.jpg");
		product.setPrice(11);
		product.setQty(1);
		
		products.add(product);
		
		product = new Product();
		
		product.setId(6);
		product.setName("Pizza marinara");
		product.setProductType("pizza");
		product.setDescription("cu de toate");
		product.setImagePath("resources/img/pizza/pz-marinara.jpg");
		product.setPrice(12);
		product.setQty(1);
		
		products.add(product);
		
		
         product = new Product();
		
		product.setId(14);
		product.setName("Pizza marinara");
		product.setProductType("pizza");
		product.setDescription("cu de toate");
		product.setImagePath("resources/img/pizza/img2.jpg");
		product.setPrice(14);
		product.setQty(1);
		
		products.add(product);
		
		  product = new Product();
			
			product.setId(15);
			product.setName("Pizza delux");
			product.setProductType("pizza");
			product.setDescription("cu de toate");
			product.setImagePath("resources/img/pizza/pz-delux.jpg");
			product.setPrice(12);
			product.setQty(1);
			
			products.add(product);	
		
		
		
		
		return products;
		
		
	}
}
