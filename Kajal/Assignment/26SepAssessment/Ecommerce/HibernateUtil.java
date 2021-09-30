package com.hibernate.util;


import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.mysql.cj.Session;

public class HibernateUtil {

	static SessionFactory  sessionFactory;
	static Session sessionObj;
	public static SessionFactory buildSessionFactory() {
		StandardServiceRegistry standardServiceRegistryObj=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata metadata=new MetadataSources(standardServiceRegistryObj).getMetadataBuilder().build();
		
		sessionFactory=metadata.getSessionFactoryBuilder().build();
		return sessionFactory;
	}
}