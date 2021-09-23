package com.bankaccount;
	import java.io.DataInputStream;
	import java.io.IOException;


	//Parent class Account
	class Account{
		
		//Variables for user details
		private String accountNumber;
		private String customerName;
		private double balance;
		
		
		public Account(String accountNumbe,String customerName,double balance){
			this.accountNumber=accountNumbe;
			this.customerName=customerName;
			this.balance=balance;
		}
			
		//Getter and setter method
		public String getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		
		//Display information
		public void displayInformation() {
			System.out.println("Customer Name "+getCustomerName());
			System.out.println("Account Number "+getAccountNumber());
			System.out.println("Account Balance "+getBalance());
			
		}
		
		
	}

	//Maintenance Charges interface
	interface MaintenanceCharge{
		public float calculateMaintenanceCharge(float noOfYear);
	}

	//Child class of Account class
	//Current Account class
	class CurrentAccount extends Account implements MaintenanceCharge{
		float m=100;
		
		public CurrentAccount(String accountNumbe,String customerName,double balance){
			super(accountNumbe,customerName,balance);
		}

		public float calculateMaintenanceCharge(float noOfYear) {
			float n=noOfYear;
			return ((m*n)+(float)200);
		}
			
	}

	//Child class of Account class 
	//Saving Account class
	class SavingAccount extends Account implements MaintenanceCharge{
		
		//base charges
		float m=50;
		float maintenanceCharge;
		public SavingAccount(String accountNumbe,String customerName,double balance) {
			super(accountNumbe,customerName,balance);
		}
		
		public float calculateMaintenanceCharge(float noOfYear) {
			float n=noOfYear;
			return ((m*n)+(float)50);
		}
		
	}

	//User interface class 
	class Userinterface {
		
		public static void main(String args[])throws IOException {
			
			int choice;
			float noOfYear;
			String accountNum;
			String customerName;
			double balance;
			float maintenanceCharge;
			//creating object for taking user input
			DataInputStream userInput=new DataInputStream(System.in);
			System.out.println("1. Saving Account \n2. Current Account");
			//For asking the user choice
			System.out.println("Enter your choice: ");
			choice=Integer.parseInt(userInput.readLine());
			
			//If choice is 1 then it will calculate maintenance charges for savingAccount 
			//If choice is 2 then it will calculate maintenance charges for currentAccount 
			switch(choice){
				case 1:
					//Taking user input
					System.out.println("Enter the Account number");
					accountNum=userInput.readLine();
					System.out.println("Enter the Customer Name");
					customerName=userInput.readLine();
					System.out.println("Enter the Balance amount");
					balance=Double.parseDouble(userInput.readLine());
					System.out.println("Enter the number of years");
					noOfYear=Float.parseFloat(userInput.readLine());
					
					//Creating object of SavingAccount class
					SavingAccount savingAccount=new SavingAccount(accountNum, customerName, balance);
				    maintenanceCharge=savingAccount.calculateMaintenanceCharge(noOfYear);
				    savingAccount.displayInformation();
					System.out.println("Maintenance Charge for Saving Account is Rs "+maintenanceCharge);
					break;
					
				case 2:
					//Taking user input
					System.out.println("Enter the Account number");
					accountNum=userInput.readLine();
					System.out.println("Enter the Customer Name");
					customerName=userInput.readLine();
					System.out.println("Enter the Balance amount");
					balance=Double.parseDouble(userInput.readLine());
					System.out.println("Enter the number of years");
					noOfYear=Float.parseFloat(userInput.readLine());
					
					//Creating object of current Account class
					CurrentAccount currentAccount=new CurrentAccount(accountNum, customerName, balance);
				    maintenanceCharge=currentAccount.calculateMaintenanceCharge(noOfYear);
				    System.out.println("Customer Name "+currentAccount.getCustomerName());
					System.out.println("Account Number "+currentAccount.getAccountNumber());
					System.out.println("Account Balance "+currentAccount.getBalance());
					currentAccount.displayInformation();
					System.out.println("Maintenance Charge for Current Account is Rs "+maintenanceCharge);
					break;
					
				default:
					System.out.println("please try again");
					break;				
			}
			
			
		}
}
