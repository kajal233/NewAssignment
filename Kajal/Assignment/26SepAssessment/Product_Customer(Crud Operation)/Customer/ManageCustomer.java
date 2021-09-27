package com.hibernate;


import java.util.ArrayList;
import java.util.List;

import com.hibernate.service.CustomerService;


public class ManageCustomer {

	public static void main(String[] args) {

		CustomerService customerService = new CustomerService();

		/* Add few employee records in database */
		Integer customerID1 = customerService.addCustomer("Ram", "Delhi", 98087);// asssinged values from here
		Integer customerID2 = customerService.addCustomer("Shyam", "Mumbai", 98789);// asssinged values from here

		List<Integer> listinfo = new ArrayList<Integer>();

		listinfo.add(customerID1);
		listinfo.add(customerID2);

		if (listinfo.size() != 0) {
			System.out.println("*************************************Inserted******************************");
		} else {
			System.out.println("##############not Inserted########################");

		}

		/* list product records in database */
		try {
			customerService.ListAllCustometer();
		} catch (Exception e) {

			e.printStackTrace();
		}

		/* update product records in database */
		try {
			customerService.updateCustomerDetails(1, 555);
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		/* delete product records in database by id */
		try {
			customerService.deleteCustomerDetailsById(1, 555);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}