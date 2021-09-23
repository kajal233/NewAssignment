package com.generics;


	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Iterator;
	import java.util.List;
	import java.util.Scanner;

	public class StudentMarks {

		public static void main(String args[]) {
			
			int totalNumberOfStudents;
			int i;
			
			Scanner studentInput=new Scanner(System.in);
			
			System.out.println("Enter number of Students ");
			totalNumberOfStudents=studentInput.nextInt(); 
			
			
			System.out.println("Enter Marks ");
			List<Integer> marksList=new ArrayList<Integer>();
			for(i=0;i<totalNumberOfStudents;i++) {
			    
				marksList.add(studentInput.nextInt());//Storing marks to array list
			}
			
			 
			// highest mark of the student
			System.out.println("Highest marks : "+Collections.max(marksList));
			//average marks of the student
			float average=0;
	        for(i=0;i<totalNumberOfStudents;i++) {
	        	
	        	average=average+marksList.get(i);
	        }
			System.out.println("Average Marks : "+(average/totalNumberOfStudents));
			
			//Displaying the marks of student
			for(i=0;i<totalNumberOfStudents;i++) {
				System.out.print((i+1)+"-"+marksList.get(i)+" ");
			}
			
			//third student mark
			System.out.println("\n3rd Student marks : "+marksList.get(2));
			
			//marks in sorted order
			System.out.print("Sorted : ");
			Collections.sort(marksList);
			Iterator<Integer> iterator=marksList.iterator();
			int flag=1;
			while(iterator.hasNext()) {
				System.out.print(flag+"-"+iterator.next()+" ");
				flag=flag+1;
			}
		}
}