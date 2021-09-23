package com.hibernateStudent;



import java.util.ArrayList;
import java.util.List;

import com.student.services.StudentServices;

public class ManageStudent {

	public static void main(String args[]) {
		StudentServices studentServices=new StudentServices();
		
		/* Add few employee records in database */
	    Integer studentDetails1 = studentServices.addStudent("Kajal","CS");// asssinged values from here
		Integer studentDetails2 = studentServices.addStudent("Pooja","IT");// asssinged values from here
		
		List<Integer> listinfo=new ArrayList<Integer>();
		
		listinfo.add(studentDetails1);
		listinfo.add(studentDetails2);
		if(listinfo.size()!=0) {
			System.out.println("********Inserted********");
		}
		else {
			System.out.println("##############Not Inserted##########################");
		}
		
		/*List employee records in databse*/
		try {
			studentServices.ListOfAllStudents();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
		/*Update employee records in database*/
		try {
			studentServices.updateStudentDetails(2, "ME");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		/* delete employee records in database by id */
		try {
			studentServices.deleteStudentById(12, "CE");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}