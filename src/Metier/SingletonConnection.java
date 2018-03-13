package Metier;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class SingletonConnection {
private static Connection cx;

private static Connection connection;
static {
	try {
		
	Class.forName("com.mysql.jdbc.Driver");
	connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Banque","root","");
	}
	catch (ClassNotFoundException ex) {
		System.out.println("probleme bd");
		System.out.println(ex.getMessage());
		
	}
	catch (SQLException ex) {
		System.out.println("probleme bd2");
		System.out.println(ex.getMessage());
		}
	}
public static Connection getConnection() {
	return connection;
}
}
