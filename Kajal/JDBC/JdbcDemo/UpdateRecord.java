

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UpdateRecord {
	public static void main(String ar[]) {

		Connection connection = null;
		final String username = "sa";
		final String password = "";
		final String jdbcurl = "jdbc:h2:~/test";

		String selectsql = "";
		// Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); for ms server

		// String dbURL = "jdbc:sqlserver://local_host\\sqlexpress";
		// String user = "sa";
		// String pass = "";

		try {

			Class.forName("org.h2.Driver"); ///
			connection = DriverManager.getConnection(jdbcurl, username, password);/// authentication
			Statement statement = connection.createStatement();// this used for creating sql statement

			String sql = "UPDATE CUSTOMER SET address='Frankfurt is in india'" + "WHERE id =3;";
			
			statement.executeUpdate(sql);

			System.out.println(" update done...");

		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}