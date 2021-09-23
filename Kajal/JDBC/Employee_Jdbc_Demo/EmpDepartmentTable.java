package com.employee;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpDepartmentTable {
	
	public static void main(String args[]) throws SQLException {
		
		Connection connection=null;
		final String username="sa";
		final String password="";
		final String jdbcurl = "jdbc:h2:~/test";
		try {
			Class.forName("org.h2.Driver");
			connection=DriverManager.getConnection(jdbcurl,username,password);
			System.out.println("Connected........");
			//connection.close();
			Statement statement=connection.createStatement();
			
			//For creating the table EMP
			/*String emptable="CREATE TABLE EMP"
					+ "(empno number(4,0),"
					+ "ename varchar2(10),"
					+ "job varchar2(9),"
					+ "mgr number(4,0),"
					+ "hiredate date,"
					+ "sal number(7,2),"
					+ "comm number(7,2),"
					+ "deptno number(2,0),"
					+ "constraint pk_emp primary key (empno),"
					+ "constraint fk_deptno foreign key (deptno) references dept (deptno))";
			statement.executeUpdate(emptable);*/
			
			//For creating table dept
			/*String depttable="CREATE TABLE DEPT("
					+ "deptno number(2,0),"
					+ "dname varchar2(14),"
					+ "loc varchar2(13),"
					+ "constraint pk_dept primary key (deptno))";
			statement.executeUpdate(depttable);*/
			//System.out.println("Table is created ");
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
