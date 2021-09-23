package com.hibernate;


import java.util.ArrayList;
import java.util.List;

import com.hibernate.service.ProductService;

public class ManageProduct {

	public static void main(String[] args) {

		ProductService productService = new ProductService();

		/* Add few employee records in database */
		Integer productID1 = productService.addProduct("Trouser", "Cloth", 1000);// asssinged values from here
		Integer productID2 = productService.addProduct("Smartwatch", "Electronic", 5000);// asssinged values from here

		List<Integer> listinfo = new ArrayList<Integer>();

		listinfo.add(productID1);
		listinfo.add(productID2);

		if (listinfo.size() != 0) {
			System.out.println("*************************************Inserted******************************");
		} else {
			System.out.println("##############not Inserted########################");

		}

		/* list product records in database */
		try {
			productService.ListAllProduct();
		} catch (Exception e) {

			e.printStackTrace();
		}

		/* update product records in database */
		try {
			productService.updateProductDetails(1, 555);
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		/* delete product records in database by id */
		try {
			productService.deleteProductDetailsById(1, 555);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}