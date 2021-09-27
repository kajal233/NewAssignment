package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class RecordStu {
	
	StudentRecord sturec=new StudentRecord();

	
	//Retrieve student name Get call using spring based web service
	@GetMapping("/stuname")
	public String printName(){
		return "Hi i am Kajal";
	}
	
	
	// Retrieve person information using get method
	@GetMapping("/StudentInfo")
	public Student getStududentInfo(){
		Student s=new Student();
		s.setRoll(100);
		s.setName("Kajal");
		s.setGender("F");
		s.setCourse("CS");
		s.setFee(5000);
		return s;
	}
	
	// Retrieve person information using get method using roll
	@GetMapping("/stuinfobyid/{roll}")
	public Student getStududentInfoByroll(@PathVariable("roll") Integer roll){
		Student s=new Student();
		s.setRoll(101);
		s.setName("Pooja");
		s.setGender("F");
		s.setCourse("CS");
		s.setFee(5000);
		return s;
	}
	
	//add the Student information POST
	@PostMapping("/insertStudentDetails")
	public Student insertDummyStudent(@RequestBody Student stu)	{
       return sturec.addStudent(stu);		
	}
	
	//upadate
	@PutMapping("/update")
	public Student upadateStudentDetails(@RequestBody Student stu)	{
		return sturec.updateStudent(stu);
	}
		
	//Get list
	@GetMapping("/getlistofstudents")
    public List<Student> getDummyStudentList(){
		List<Student> listofstu=sturec.getAllStudentlist();
		return listofstu;
    }
	
	//Delete by id
	@DeleteMapping("/deleterecordStu/{id}")
	public void deleteDummyStudent(@PathVariable("id") Integer id) {
	sturec.deleteStudent(id);	
	}
}
