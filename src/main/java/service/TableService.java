package service;

import java.sql.ResultSet;
import java.util.ArrayList;

import domain.Table;
import persistence.TableDAO;
import util.ServletUtilities;

public class TableService {
	
	public String getTablesList(String query) throws Exception{
		String tableRowList = " ";
		TableDAO tableDAO = new TableDAO(); 
		ResultSet resultSet =  tableDAO.executeSQL(query);
		ArrayList<Table> tableList=  ServletUtilities.getTableList(resultSet);
		for(Table table : tableList ){
			tableRowList = tableRowList.concat(ServletUtilities.getTableList(table));
		}
		return tableRowList;
		
	}
}
