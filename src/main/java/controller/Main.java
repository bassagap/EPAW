package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.UserService;
import util.UserUtilities;

/**
 * Servlet implementation class Main
 */
@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Main() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String title = "Users Table";
		UserService userService = new UserService();
		String userRowList = null;
		try {
			userRowList = userService.getTablesList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.println(
				UserUtilities.headWithTitle(title) +
				"<body/>\n" +
				"<h1>" + title + "</h1>" +
				"<table style = 'border: 1px solid black;'>" + userRowList +
				"</table>"
				);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	public static String dummyMethod(HttpSession session){
		UserService userService = new UserService();
		String userRowList = null;
		try {
			userRowList = userService.getTablesList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return UserUtilities.headWithTitle("Escoita") +
				"<body/>\n" +
				"<h1>" + "escoita" + "</h1>" +
				"<table style = 'border: 1px solid black;'>" + userRowList +
				"</table>";
	}

}
