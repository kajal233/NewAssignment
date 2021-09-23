

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTableDemo {
	public static void main(String ar[]) {

		Connection connection = null;
		final String username = "sa";
		final String password = "";
		final String jdbcurl = "jdbc:h2:~/test";

		
		// Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); for ms server

		// String dbURL = "jdbc:sqlserver://localhost\\sqlexpress";
		// String user = "sa";
		// String pass = "";

		try {

			Class.forName("org.h2.Driver"); ///
			connection = DriverManager.getConnection(jdbcurl, username, password);/// authentication
			Statement statement = connection.createStatement();// this used for creating sql statement

			
			  String sql = "CREATE TABLE customer " + "(id INTEGER not NULL, " +
			  " age VARCHAR(255), " + " address VARCHAR(255), " + " salary INTEGER, " +
			  " PRIMARY KEY ( id ))";
			  statement.executeUpdate(sql);
			 System.out.println("Created Table in given database"); //create table in database

			

		
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
