package persistence;

import java.sql.*;
import java.util.ArrayList;
import domain.User;


public class UserDAO {
	private Connection connection;
	private Statement statement;
	
	public UserDAO() throws Exception{
		String user = "mysql";
		String password = "prac"; 
		
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		connection = DriverManager.getConnection("jdbc:mysql://localhost/ts1?user=" + user + "&password=" + password ); 
		statement = connection.createStatement(); 
	}
	
	// execute query to access users table: 
	public ArrayList<User> getUsersList () throws SQLException{
		String query = "SELECT * FROM TAULA";
		ResultSet resultSet =  statement.executeQuery(query);
		ArrayList<User> tableList = new ArrayList<User>();
		  while(resultSet.next()){
			 User table = new User(); 
			 table.setName(resultSet.getString("nom"));
			 table.setDescription(resultSet.getString("descripcio"));
			 table.setId(resultSet.getLong("id"));
			 table.setTelefon(resultSet.getLong("telefon"));
			 tableList.add(table);
		  }
		  return tableList;
		
	}
	public void disconnectBD() throws SQLException {
		statement.close();
		connection.close();
	}
}
