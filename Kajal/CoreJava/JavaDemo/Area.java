package Studentcom.demo;
import java.util.Scanner;

public class Area {
	    int length,breadth;
	  public Area(int l,int b)
	  {
	       length=l;
	       breadth=b;
	   }
	  public int getArea()
	  {
	        return length*breadth;
	  }
	  
	  public static void main(String[] args)
	  {
	     int l,b;
	     Scanner s = new Scanner(System.in);
	     System.out.println("Enter length"); 
	     l=s.nextInt();
	     System.out.println("Enter breadth");
	     b=s.nextInt();
	     Area a=new Area(l,b);
	    System.out.println("Area is :"+a.getArea());
	  }
	public void setDim(double l, double b) {
		// TODO Auto-generated method stub
		
	}
	}  

	
	   