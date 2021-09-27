package com.hibernate.main;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.hibernate.entity.Answer;
import com.hibernate.entity.Question;


//one to many
public class Store {

	public static void main(String ar[]) {

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();

		Transaction t = session.beginTransaction();
         //ans 1
		Answer ans1 = new Answer();
		ans1.setAnswername("Java is a programming language");
		ans1.setPostedBy("Ravi Malik");
	       //ans 2
		Answer ans2 = new Answer();
		ans2.setAnswername("Java is a platform");
		ans2.setPostedBy("Sudhir Kumar");
	       
		
		//ans 3 for question 2
		Answer ans3 = new Answer();
		ans3.setAnswername("Servlet is an Interface");
		ans3.setPostedBy("Jai Kumar");
	       //ans 4 for question 2
		Answer ans4 = new Answer();
		ans4.setAnswername("Servlet is an API");
		ans4.setPostedBy("Arun");
              //adding to list
		ArrayList<Answer> list1 = new ArrayList<Answer>();
		list1.add(ans1);
		list1.add(ans2);
	    //adding to list
		ArrayList<Answer> list2 = new ArrayList<Answer>();
		list2.add(ans3);
		list2.add(ans4);
		
		
                //question 1
		Question question1 = new Question();
		
		question1.setQuestionname("What is Java?");
		question1.setAnswers(list1);

		
		  //qeustion 2
		Question question2 = new Question();

		question2.setQuestionname("What is Servlet?");
		question2.setAnswers(list2);

		session.persist(question1);//save or  insert inser into db
		session.persist(question2);//save or  insert inser into db

		t.commit();
		session.close();
		System.out.println("success");

	}

}
