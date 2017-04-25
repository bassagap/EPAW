package service;

import java.util.ArrayList;

import domain.User;
import persistence.UserDAO;

public class UserService {
	
	public ArrayList<User> getUsersList() throws Exception{
		UserDAO userDAO = new UserDAO(); 
		ArrayList<User> usersList =  userDAO.getUsersList();
		return usersList;	
	}
}
