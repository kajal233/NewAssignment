package com.employee;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveDept {

	public static void main(String args[]) {
		
		Connection connection=null;
		final String username="sa";
		final String password="";
		final String jdbcurl="jdbc:h2:~/test";
		try {
			Class.forName("org.h2.Driver");
			connection=DriverManager.getConnection(jdbcurl,username,password);
			System.out.println("Connected........");
			Statement statement=connection.createStatement();
			
			//Retrieving department record 
		    String sql="Select * from dept";
		    ResultSet resultSet=statement.executeQuery(sql);
		    while(resultSet.next()) {
		    	System.out.println("Deptar number : "+resultSet.getInt("deptno"));
		    	System.out.println("Department name : "+resultSet.getString("dname"));
		    	System.out.println("Department location : "+resultSet.getString("loc"));
		    }
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
