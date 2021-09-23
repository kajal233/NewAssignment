package com.student.services;


import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.hibernate.util.HibernateUtil;
import com.hibernateStudent.Student;

public class StudentServices {

	static SessionFactory sessionFactoryObj;
	static Session sessionObj;
	
	/*------------------------Post request--------------------------------------*/
	/* Method to CREATE an Student table in the database business logic */
	public Integer addStudent(String name, String department) {
		Transaction transaction=null;
		Integer studentDetails=null;
		try {		
			sessionObj=HibernateUtil.buildSessionFactory().openSession();
			transaction=sessionObj.beginTransaction();
			Student student=new Student(name, department);
			studentDetails=(Integer) sessionObj.save(student);
			transaction.commit();
		}
		catch (HibernateException e) {
		   if(transaction!=null) {
			   transaction.rollback();
		   }
		   e.printStackTrace();
		}
		finally {
			sessionObj.close();
		}
		
		return studentDetails;
	}
	
	/*------------------------Get Request-------------------------------------------------*/
	/*Method to get list of students from database*/
	public void ListOfAllStudents() {
		Transaction transaction=null;
		try {
			sessionObj=HibernateUtil.buildSessionFactory().openSession();
			transaction=sessionObj.beginTransaction();
			
			//Logic
			List students=sessionObj.createQuery("From Student").list();
			Iterator iterator=students.iterator();
			while(iterator.hasNext()) {
				Student student1=(Student) iterator.next();
				System.out.println("Student Enrollment number "+student1.getEnrollmentNo());
				System.out.println("Student Name "+student1.getName());
				System.out.println("Student Department "+student1.getDepartment());
			}
		}
		catch(HibernateException e) {
			if(transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		finally {
			sessionObj.close();
		}
	}
	
	//Update
	//PUT
	/*Method to update an student in the database business logic*/
	public void updateStudentDetails(Integer StudentId,String department) {
		
		Transaction transaction=null;
		try {
			sessionObj=HibernateUtil.buildSessionFactory().openSession();
			transaction=sessionObj.beginTransaction();
			//update logic
			Student student=(Student) sessionObj.get(Student.class, StudentId);
			student.setDepartment(department);
			sessionObj.update(student);
			System.out.println("Update sucessfully");
			transaction.commit();
		}
		catch(HibernateException e) {
			if(transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		finally {
			sessionObj.close();
		}
	}
	
	
	//DELETE
	//Put 
	/*Method for delete student record*/
	public void deleteStudentById(Integer StudentId,String department) {
		Transaction transaction=null;
		try {
			sessionObj=HibernateUtil.buildSessionFactory().openSession();
			transaction=sessionObj.beginTransaction();
		    Student student=(Student) sessionObj.get(Student.class,StudentId);
			student.setDepartment(department);
			sessionObj.delete(student);
			System.out.println("deleted sucessfully..."+student.getEnrollmentNo());;
            transaction.commit();
		}
		catch(HibernateException e) {
			if(transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		finally {
			sessionObj.close();
		}
	}
}