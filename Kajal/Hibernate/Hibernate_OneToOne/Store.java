package com.hibernate;  
  
import org.hibernate.*;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;  
  
public class Store {  
public static void main(String[] args) {  
    
	StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
	
	SessionFactory factory=meta.getSessionFactoryBuilder().build();
	Session session=factory.openSession();
	
    Transaction t=session.beginTransaction(); 
	//setting some values  of employee say ravi
    Employee e1=new Employee();  
    e1.setName("Ravi Malik");  
    e1.setEmail("ravi@gmail.com");  
      
    
	//setting some values  of employee ravi
    Address address1=new Address();  
    address1.setAddressLine1("G-21,Lohia nagar");  
    address1.setCity("Ghaziabad");  
    address1.setState("UP");  
    address1.setCountry("India");  
    address1.setPincode(201301);  
      
    //setting employ to address
    e1.setAddress(address1);  
       //insert into db
    session.persist(e1);  
    t.commit();  
      
    session.close();  
    System.out.println("success....");  
}  
}  