package com.jprogrammers.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class HibernateUtil {

    private static SessionFactory sessionFactory;
    private static ServiceRegistry serviceRegistry;

    public static void buildSessionFactory(){
        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {

        if(sessionFactory == null || sessionFactory.isClosed()){
            buildSessionFactory();
        }

        return sessionFactory.openSession();

    }

    @SuppressWarnings("deprecation")
	@Override
    protected void finalize() throws Throwable {

        sessionFactory.close();

        super.finalize();
    }

}
