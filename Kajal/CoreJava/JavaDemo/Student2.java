package Studentcom.demo;

public class Student2 {
	int rollsam=11;
	int rolljohn=12;
	long phonenosam=987654321L;
	long phonenojohn=123456789L;
	String addrsam="Delhi";
	String addrjohn="Mumbai";
	
	public static void main(String[]args)
	{
		Student2 sam=new Student2();
		Student2 john=new Student2();
		System.out.println(sam.rollsam);
		System.out.println(john.rolljohn);
		System.out.println(sam.phonenosam);
		System.out.println(sam.phonenojohn);
		System.out.println(sam.addrsam);
		System.out.println(sam.addrjohn);
		
		
	}

}
