package com.vvit.spring_web;

public class User {
	
	
	private String uname;
//	private String lname;
	
	public User(String uname)
	{
		this.uname = uname;
//		this.lname = lname;
	}
	
//	public void setFName(String fname)
//	{
//		this.fname = fname;
//	}
	
	public void setUname(String uname)
	{
		this.uname = uname;
	}
	
//	public String getFName()
//	{
//		return fname;
//	}
	public String getUname()
	{
		return uname;
	}
}
