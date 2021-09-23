package com.hibernate;

public class Product {


	  //this is called property
		private int id;
		private String productName;
		private String productCategory;
		private int price;

		public Product() {
		}

		public Product(String productName, String productCategory, int price) {
			super();

			this.productName = productName;
			this.productCategory = productCategory;
			this.price = price;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getProductCategory() {
			return productCategory;
		}

		public void setProductCategory(String productCategory) {
			this.productCategory =productCategory;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

	}
