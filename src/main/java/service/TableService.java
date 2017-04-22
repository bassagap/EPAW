package service;

import java.sql.ResultSet;
import java.util.ArrayList;

import domain.Table;
import persistence.TableDAO;
import util.ServletUtilities;

public class TableService {
	
	public ArrayList<String> getUsersList(String query) throws Exception{
		ArrayList<String> userList = new ArrayList<String>();
		TableDAO tableDAO = new TableDAO(); 
		ResultSet resultSet =  tableDAO.executeSQL(query);
		ArrayList<Table> tableList=  ServletUtilities.getTableList(resultSet);
		for(Table table : tableList ){
			userList.add(table.getName());
		}
		return userList;
	}	
}
