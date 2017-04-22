package persistence;
import java.sql.*;

public class TableDAO {
	private Connection connection;
	private Statement statement;
	
	public TableDAO() throws Exception{
		String user = "mysql";
		String password = "prac"; 
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		connection = DriverManager.getConnection("jdbc:mysql://localhost/ts1?user=" + user + "&password=" + password ); 
		statement = connection.createStatement(); 
	}
	
	// execute query to access users table: 
	public ResultSet executeSQL (String query) throws SQLException{
		return statement.executeQuery(query);
	}
	public void disconnectBD() throws SQLException {
		statement.close();
		connection.close();
	}
}
