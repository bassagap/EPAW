package models;

import java.io.Serializable;

import persistence.UserDAO;

public class BeanUser implements Serializable  {

	private static final long serialVersionUID = 1L;

	private String userName = "";
	private String mail = "";
	private String password = ""; 
	private Boolean tc = false; 
	/*  Control which parameters have been correctly filled */
	private int[] error = {0,0}; 
	
	/* Getters */
	public String getUserName(){
		return userName;
	}
	
	public String getMail() {
		return mail;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	
	public int[] getError() {
		return error;
	}
	

	/**
	 * @return the tc
	 */
	public Boolean getTc() {
		return tc;
	}
	
	/*Setters*/
	public void setUserName(String userName) throws Exception{
		this.userName = userName;
	}
	public void setErrorName(){
		this.error[0] = 1; 
	}
	
	/**
	 * @param tc the tc to set
	 */
	public void setTc(Boolean tc) {
		this.tc = tc;
	}
	public void setMail(String mail){
		this.mail = mail;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}
