package persistence;

import java.sql.*;
import java.util.ArrayList;
import domain.User;
import models.BeanUser;


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
	public Boolean isValidUserName(String userName) throws SQLException{
		Boolean isValid = true; 
		String query = "SELECT * FROM TAULA WHERE USERNAME = '" + userName +"'"; 
		ResultSet resultSet =  statement.executeQuery(query);
		if(resultSet.next()){
			isValid = false; 
		}
		return isValid; 
	}
	public void insertUser(BeanUser user) throws SQLException{
		String query = "INSERT INTO TAULA (USERNAME, PASSWORD) VALUES ('"+user.getUserName()+ "', '" + user.getPassword()+  "')"; 
		int resultSet =  statement.executeUpdate(query);
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
