package com.example.demo;

import java.util.*;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Restdemo1 {

	PersonService personservice=new PersonService();
	//Get call using spring based web service
	
	@GetMapping("/myurl")
	public String sayHello()
	{
		return "hi how are you";
	}
	
	//Retrive person info using @get method
		@GetMapping("/personinfo")
		public person getDummyPerson()
		{
			person p=new person();// person class object created
			p.setName("Ram");
			p.setEmail("Ram@gmail.com");
			p.setAddress("Delhi");
			return p;
		}
		
		//Retrieve the person information by id
		@GetMapping("/personinforid/{id}")
		public person getDummyPersonById(@PathVariable("id") Integer id)	
		{
			person p=new person();
			p.setId(101);
			p.setName("Ram");
			p.setEmail("Ram@gmail.com");
			p.setAddress("Delhi");
			return p;
		}
		
		// add the person information POst
		 @PostMapping(value = "/insertpersondetails")
		public person insertDummyPerson(@RequestBody person pers) {
		return personservice.addPerson(pers); //calling the service
		}

		//update person info
		@PutMapping("/update")
		public person updatepersonInfo(@RequestBody person person) {
		return personservice.updatePerson(person);

		 }
		//get list
		@GetMapping("/getlist")
		public List<person> getDummyPersonList() {
		List<person> listOfPerson = personservice.getAllPersonlist();
		return listOfPerson;
		}
		
		//Delete by id
		@DeleteMapping("/deleterecord/{id}")
		public void deleteDummyPerson(@PathVariable("id") Integer id) {
		personservice.deletePerson(id);	
		}
		//Delete all record from the list
		@DeleteMapping("/deleteallrecord")
		public List<person> delDummyPersonList() {
			List<person> listOfPerson = personservice.delAllPersonlist();
			return listOfPerson;
		}
		
}
