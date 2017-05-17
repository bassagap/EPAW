package service;

import java.sql.SQLException;
import java.util.ArrayList;

import domain.User;
import models.BeanUser;
import persistence.UserDAO;

public class UserService {
	public ArrayList<User> getUsersList() throws Exception{
		UserDAO userDAO = new UserDAO(); 
		ArrayList<User> usersList =  userDAO.getUsersList();
		return usersList;	
	}
	public Boolean userExists (BeanUser user) throws Exception{
		UserDAO userDAO = new UserDAO(); 
		return !userDAO.isValidUserName(user.getUserName()); 
	}
	public void insertUser(BeanUser user) throws Exception{
		UserDAO userDAO = new UserDAO(); 
		userDAO.insertUser(user);
	}
}
