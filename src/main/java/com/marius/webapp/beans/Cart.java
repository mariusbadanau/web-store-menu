package com.marius.webapp.beans;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	
	private int checkDrinks = 0;
	private int checkPizza = 0;
	
	List<Product>  productDrinks = (new ProdusBuilderDrinks()).createProducts();
	List<Product>  productPizza = (new ProdusBuilderPizza()).createProducts();
	List<Product> productOrdered = new ArrayList<Product>();
	
	public boolean checkExist(int productId)
	
	{
		for (Product produs : productOrdered)
		{
			if (produs.getId() == productId)
			{
				return true;
			}
		}
		
		return false;
	}
	
	public void addToCart(int productId)
	{
		
		  for (Product produs : productDrinks)
		  {
			  if (produs.getId() == productId)
			  {
				  checkDrinks = 1;
				  
				  if(checkExist(productId) == true)
					  
				  {
					  productOrdered.remove(produs);
					  int qty = produs.getQty() + 1;
					  produs.setQty(qty);
				  }
				  productOrdered.add(produs);
			  }
			 
		  }
		  
		  for (Product produs : productPizza)
		  {
			  if (produs.getId() == productId)
			  {
				  checkPizza = 1;
				  
				  if(checkExist(productId) == true)
					  
				  {
					  productOrdered.remove(produs);
					  int qty = produs.getQty() + 1;
					  produs.setQty(qty);
				  }
				  
				  productOrdered.add(produs);
			  }
				
			 
		  }
		
	}
	
	public double showTotalSum()
	{
		double totalSum = 0;
		
		for (Product produs : productOrdered)
		{
			totalSum += (produs.getPrice() * produs.getQty());
		}
		
		return totalSum;
	}

	public int checkIfOrderIsOk()
	
	{
		int ok = 1;
		double totalSum = showTotalSum();
		
		
		
		if (productOrdered.isEmpty())
			
			ok = 0;
		
		if (checkPizza == 0 && totalSum < 10)
		
		{
			ok = 0;
		}
		
		else
			
			if (checkDrinks == 0 && totalSum < 30)
			
			{
				ok = 0;
			}
		
		return ok;
		
		}
	
	public void emptyCart()
	
	{
		
		productOrdered.clear();
		
	}
	
	public void deleteProduct(int productId)
	
	{
		
		 for (Product produs : productDrinks)
		 
		 {
			  if (produs.getId() == productId)
			
			  {
				  productOrdered.remove(produs);
			  }
			 
		  }
		 
		 for (Product produs : productPizza)
			 
		 {
			  if (produs.getId() == productId)
			
			  {
				  productOrdered.remove(produs);
			  }
			 
		  }
	}


	public int getCheckDrinks() {
		return checkDrinks;
	}

	public void setCheckDrinks(int checkDrinks) {
		this.checkDrinks = checkDrinks;
	}

	public int getCheckPizza() {
		return checkPizza;
	}

	public void setCheckPizza(int checkPizza) {
		this.checkPizza = checkPizza;
	}

	public List<Product> getProductOrdered() {
		return productOrdered;
	}

	public void setProductOrdered(List<Product> productOrdered) {
		this.productOrdered = productOrdered;
	}

}
