package com.employee;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertEmpDetail {

	public static void main(String args[]) throws SQLException {
		
		Connection connection=null;
		final String username="sa";
		final String password="";
		final String jdbcurl = "jdbc:h2:~/test";
		try {
			Class.forName("org.h2.Driver");
			connection=DriverManager.getConnection(jdbcurl,username,password);
			System.out.println("Connected........");
			Statement statement=connection.createStatement();
			
			//Inserting record into Department table
			/*
			 String insert="INSERT INTO Dept VALUES(8,'Marketing','D2')";
			statement.executeUpdate(insert);
			System.out.println("Done..........");*/
			
			//Inserting record in Emp table
			/*String insert="INSERT INTO EMP VALUES(100,'Tom','IT',11,'2021-09-20',40000,35,5)";
			statement.executeUpdate(insert);
			System.out.println("Done..........");		*/		
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			connection.close();
			//statement.close();
		}
	}
}
