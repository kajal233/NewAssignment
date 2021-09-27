package com.mapping;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.databaseschema.BillingAddress;
import com.databaseschema.Cart;
import com.databaseschema.CartItem;
import com.databaseschema.Customer;
import com.databaseschema.Product;
import com.databaseschema.SalesOrder;
import com.databaseschema.ShippingAddress;
import com.databaseschema.User;

public class StoreRecord{

	public static void main(String args[]) {
		
		StandardServiceRegistry standardServiceRegistryObj=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata metadata=new MetadataSources(standardServiceRegistryObj).getMetadataBuilder().build();
		
		SessionFactory sessionFactory=metadata.getSessionFactoryBuilder().build();
		Session session=sessionFactory.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		new Customer();
		
		new ShippingAddress();
		
		new BillingAddress();
		
		new User();
		
		new Cart();
		
		new SalesOrder();
		
		new Product();
		
		new CartItem();
		
		transaction.commit();
		session.close();
		System.out.println("Done");
	}
}