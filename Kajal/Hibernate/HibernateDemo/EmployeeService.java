package com.hibernate.service;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.Employee;
import com.hibernate.util.HibernateUtil;

public class EmployeeService {

	static SessionFactory sessionFactoryObj;
	static Session sessionObj;

	//////////////// POST request//////////////////////////////////////////

	/* Method to CREATE an employee in the database business logic */
	public Integer addEmployee(String fname, String lname, int salary) {

		Transaction tx = null;
		Integer employeeID = null;

		try {

			sessionObj = HibernateUtil.buildSessionFactory().openSession();
			tx = sessionObj.beginTransaction();

			Employee employee = new Employee(fname, lname, salary);// created the object of employee class
			employeeID = (Integer) sessionObj.save(employee); // save the object or insert the recording

			tx.commit();// explictiy call the commit esure that auto commite should be false
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			sessionObj.close();
		}
		return employeeID;
	}

	//////////////// GET request//////////////////////////////////////////

	// list

	/* Method to CREATE an employee in the database business logic */
	public void ListAllEmployee() {
		System.out.println(" *************from inside  ListAllEmployee()**********************  ");
		Transaction tx = null;
		try {

			sessionObj = HibernateUtil.buildSessionFactory().openSession();
			tx = sessionObj.beginTransaction();
			// retrive logic
			List employees = sessionObj.createQuery("From Employee").list(); // select * from employee: "Employee refer
																				// Employee class
			Iterator iterator = employees.iterator();
			while (iterator.hasNext()) {
				Employee employee1 = (Employee) iterator.next();
				System.out.println("fist  name  " + employee1.getFirstName());
				System.out.println("last  name  " + employee1.getLastName());
				System.out.println("salary    " + employee1.getSalary());
			}

			tx.commit();// explictiy call the commit esure that auto commite should be false
		} catch (

		HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			sessionObj.close();
		}
	}

// update

////////////////PUT request   id//////////////////////////////////////////

	/* Method to update an employee in the database business logic */
	public void updateEmployeeDetails(Integer EmnployeeId, int salary) {
		System.out.println(" *************from inside  updateEmployeeDetails()**********************  ");
		Transaction tx = null;
		try {

			sessionObj = HibernateUtil.buildSessionFactory().openSession();
			tx = sessionObj.beginTransaction();
			// update logic

			Employee employee = (Employee) sessionObj.get(Employee.class, EmnployeeId);

			employee.setSalary(salary);

			sessionObj.update(employee);// hibernate will form update query automatically

			System.out.println("update sucessfully...");

			tx.commit();// explictiy call the commit esure that auto commite should be false
		} catch (

		HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			sessionObj.close();
		}

	}

// delete

////////////////PUT request   id//////////////////////////////////////////

	/* Method to update an employee in the database business logic */
	public void deleteEmployeeDetailsById(Integer EmnployeeId, int salary) {
		System.out.println(" *************from inside  deleteEmployeeDetailsById()**********************  ");
		Transaction tx = null;
		try {

			sessionObj = HibernateUtil.buildSessionFactory().openSession();
			tx = sessionObj.beginTransaction();
//update logic

			Employee employee = (Employee) sessionObj.get(Employee.class, EmnployeeId);

			employee.setSalary(salary);

			sessionObj.delete(employee);// hibernate will form delete query automatically

			System.out.println("deleted sucessfully..."+employee.getId());

			tx.commit();// explictiy call the commit esure that auto commite should be false
		} catch (

		HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			sessionObj.close();
		}

	}

}
