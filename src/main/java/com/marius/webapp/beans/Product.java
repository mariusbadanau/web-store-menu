package com.marius.webapp.beans;

public class Product {

	 public int id;

	    private String name;
	    
	    private Boolean featured;
	    
	    private String productType;

	    private String description;

	    private String imagePath;

	    private double price;
	    
	   private int qty;
	    

		/**
		 * @return the id
		 */
		public int getId() {
			return id;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(int id) {
			this.id = id;
		}

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		/**
		 * @return the featured
		 */
		public Boolean getFeatured() {
			return featured;
		}

		/**
		 * @param featured the featured to set
		 */
		public void setFeatured(Boolean featured) {
			this.featured = featured;
		}

		/**
		 * @return the productType
		 */
		public String getProductType() {
			return productType;
		}

		/**
		 * @param productType the productType to set
		 */
		public void setProductType(String productType) {
			this.productType = productType;
		}

		/**
		 * @return the description
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * @param description the description to set
		 */
		public void setDescription(String description) {
			this.description = description;
		}

		/**
		 * @return the imagePath
		 */
		public String getImagePath() {
			return imagePath;
		}

		/**
		 * @param imagePath the imagePath to set
		 */
		public void setImagePath(String imagePath) {
			this.imagePath = imagePath;
		}

		/**
		 * @return the price
		 */
		public double getPrice() {
			return price;
		}

		/**
		 * @param price the price to set
		 */
		public void setPrice(double price) {
			this.price = price;
		}

		/**
		 * @return the qty
		 */
		public int getQty() {
			return qty;
		}

		/**
		 * @param qty the qty to set
		 */
		public void setQty(int qty) {
			this.qty = qty;
		}

	
}
