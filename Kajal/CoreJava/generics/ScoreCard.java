package com.generics;


	import java.util.Collections;
	import java.util.HashMap;
	import java.util.Iterator;
	import java.util.Map;
	import java.util.Scanner;

	public class ScoreCard {

		public static void main(String args[]) {
			
			Map<String,Integer> batsmanscore=new HashMap<String,Integer>();
			Scanner input=new Scanner(System.in);
			System.out.println("Enter runs scored");
			for(int i=0;i<5;i++) {
				String nameRun[]=input.next().split("-");
				String name=nameRun[0];
				int run=Integer.parseInt(nameRun[1]);
				
				batsmanscore.put(name, run);
			}
			
			//Name of players who have batted
			System.out.println("Players who batted ");
			Iterator<String> iterator=batsmanscore.keySet().iterator();
			while(iterator.hasNext()) {
				String name=iterator.next();
				Integer run=batsmanscore.get(name);
			    System.out.println(name);
			}
			
			int runByDhoni=0;
			int totalruns=0;
			System.out.println("Scores by Players ");
			Iterator<String> iterator1=batsmanscore.keySet().iterator();
			while(iterator1.hasNext()) {
				String name=iterator1.next();
				Integer run=batsmanscore.get(name);
				System.out.println(name+" : "+run);
			    totalruns=totalruns+run;
			    if(name.equalsIgnoreCase("Dhoni")) {
			    	runByDhoni=run;
			    }
			}
			System.out.println("Total Score : "+totalruns);
			
			int maxRun=Collections.max(batsmanscore.values());
			Iterator<String> iterator3=batsmanscore.keySet().iterator();
			while(iterator3.hasNext()) {
				String name=iterator3.next();
				Integer run=batsmanscore.get(name);
			    if(run==maxRun) {
			    	System.out.println("Name of Highest Scorer : "+name);
			    }
			}
			//Run scored by Dhoni
			System.out.println("Runs Scored by Dhoni : "+runByDhoni);
			
		}
	
}
