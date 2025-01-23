package edu.jspiders.springcore.bean;

import lombok.Data;

@Data
public class DatabaseConnection {
	
	{
		System.out.println("DatabaseConnection is created");
	}
	private String db_url;
	private String user_name;
	private int password;

}
