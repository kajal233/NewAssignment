package com.example.demo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/*
->It is just a helper class which should be replace by database implementation
->It is not very well written class , it is just used for demonstration.
*/

public class PersonService {
	static HashMap<Integer, person> personIdMap = getPersonIdMap(); //map list
	public PersonService()
	{
		super();
		if (personIdMap == null) {
			personIdMap = new HashMap<Integer, person>();
			// Creating some objects of Person while initializing
			person indiaPerson = new person(1, "ram1", "ram@gmail.com", "delhi");
			person chinaPerson = new person(2, "ram2", "ram@gmail.com", "delhi");
			person nepalPerson = new person(3, "ram3", "ram@gmail.com", "delhi");
			person bhutanPerson = new person(4, "ram4", "ram@gmail.com", "delhi");

			 //adding map list of collections in java
			personIdMap.put(1, indiaPerson);
			personIdMap.put(2, chinaPerson);
			personIdMap.put(3, nepalPerson);
			personIdMap.put(4, bhutanPerson);
			}
		
	}
	public List<person> getAllPersonlist() {
		List<person> personlist = new ArrayList<person>(personIdMap.values());
		return personlist;
		}

		 public person getPerson(int id) {
		person Person = personIdMap.get(id);
		return Person;
		}
		// add person
		public person addPerson(person person) {
		person.setId(getMaxId()+ 1);
		// key , value
		personIdMap.put(person.getId(), person); ///logic class
		return person;
		}
		//update
		public person updatePerson(person person) {
		if (person.getId() <= 0)
		return null;
		personIdMap.put(person.getId(), person);
		return person;

		 }
		
		
		
		
		//delete

		 public void deletePerson(Integer id) {
		personIdMap.remove(id);
		}

		 public static HashMap<Integer, person> getPersonIdMap() {
		return personIdMap;
		}
		 //Delete all list 
		 public List<person> delAllPersonlist() {
				List<person> personlist = new ArrayList<person>(personIdMap.values());
				personlist.subList(0, personlist.size()).clear();
		        System.out.println(personlist.size());
				return personlist;
				}

		 // Utility method to get max id
		public static int getMaxId() {
		int max = 0;
		for (int id : personIdMap.keySet()) {
		if (max <= id)
		max = id;

		 }
		return max;
		}
		
		

}
