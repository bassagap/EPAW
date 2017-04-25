package service;

import java.util.ArrayList;

import domain.User;
import persistence.UserDAO;
import util.UserUtilities;

public class UserService {
	
	public String getTablesList() throws Exception{
		String userRowList = " ";
		UserDAO userDAO = new UserDAO(); 
		ArrayList<User> userList =  userDAO.getUsersList();
		for(User user : userList ){
			userRowList = userRowList.concat(UserUtilities.getTableList(user));
		}
		return userRowList;
		
	}
}
