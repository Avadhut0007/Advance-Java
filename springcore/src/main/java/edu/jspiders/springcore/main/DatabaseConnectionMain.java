package edu.jspiders.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.jspiders.springcore.bean.DatabaseConnection;
import edu.jspiders.springcore.bean.DatabaseOperation;
import edu.jspiders.springcore.config.ApplicationConfiguration;

public class DatabaseConnectionMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		DatabaseConnection databaseConnection=applicationContext.getBean(DatabaseConnection.class);
		System.out.println(databaseConnection);
		DatabaseOperation databaseOperation = applicationContext.getBean(DatabaseOperation.class);
		System.out.println(databaseOperation);
		((AnnotationConfigApplicationContext)applicationContext).close();

	}

}
