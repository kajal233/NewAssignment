package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentRecord {
	
	static HashMap<Integer, Student> StudentIdMap = getStudentIdMap(); //map list
	public StudentRecord(){
		
		super();
		if (StudentIdMap == null) {
			StudentIdMap = new HashMap<Integer, Student>();
			// Creating some objects of Student while initializing
			Student indiaStudent = new Student(1, "Ram", "M", "Delhi",5000);
			Student chinaStudent = new Student(2, "Shyam", "M", "Delhi",10000);
			Student nepalStudent = new Student(3, "Tom", "M", "Delhi",15000);
			Student bhutanStudent = new Student(4, "Jerry", "M", "Delhi",25000);

			 //adding map list of collections in java
			StudentIdMap.put(1, indiaStudent);
			StudentIdMap.put(2, chinaStudent);
			StudentIdMap.put(3, nepalStudent);
			StudentIdMap.put(4, bhutanStudent);
			}
		
	}
	public List<Student> getAllStudentlist() {
		List<Student> Studentlist = new ArrayList<Student>(StudentIdMap.values());
		return Studentlist;
		}

		 public Student getStudent(int roll) {
		Student Student = StudentIdMap.get(roll);
		return Student;
		}
		// add Student
		public Student addStudent(Student Student) {
		Student.setRoll(getMaxId()+ 1);
		// key , value
		StudentIdMap.put(Student.getRoll(), Student); ///logic class
		return Student;
		}
		//update
		public Student updateStudent(Student Student) {
		if (Student.getRoll() <= 0)
		return null;
		StudentIdMap.put(Student.getRoll(), Student);
		return Student;

		 }
		
		
		//delete

		 public void deleteStudent(int id) {
		StudentIdMap.remove(id);
		}

		 public static HashMap<Integer, Student> getStudentIdMap() {
		return StudentIdMap;
		}

		 // Utility method to get max id
		public static int getMaxId() {
		int max = 0;
		for (int id : StudentIdMap.keySet()) {
		if (max <= id)
		max = id;

		 }
		return max;
		}

}
