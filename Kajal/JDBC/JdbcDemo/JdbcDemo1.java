
import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcDemo1{
	public static void main(String ar[]) {
		Connection connection=null;
		final String username="sa";
		final String password="";
		final String jdbcurl="jdbc:h2:~/test";
 try{
	 Class.forName("org.h2.Driver");
	 connection=DriverManager.getConnection(jdbcurl,username,password);
	 System.out.println("Connected..");
 }
 catch(Exception e) {
	 
 
 e.printStackTrace();
	}}
}