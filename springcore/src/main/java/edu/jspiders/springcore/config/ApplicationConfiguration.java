package edu.jspiders.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import edu.jspiders.springcore.bean.DatabaseConnection;
import edu.jspiders.springcore.bean.DatabaseOperation;

@ComponentScan("edu.jspiders.springcore.bean")
public class ApplicationConfiguration {
	
	@Bean
	protected DatabaseConnection getDatabaseConnection() {
		System.out.println("database connection method is invoked");
		DatabaseConnection databaseConnection = new DatabaseConnection();
		databaseConnection.setDb_url("jdbc:mysql://localhost:3306");
		databaseConnection.setUser_name("root");
		databaseConnection.setPassword(1234);
		return databaseConnection;
	}

	@Bean
	protected DatabaseOperation getDatabaseOperation() {
		System.out.println("database operation is invoked");
		DatabaseOperation databaseOperation = new DatabaseOperation();
		databaseOperation.setQuery("create database bean");
		
		return databaseOperation;
	}

}
