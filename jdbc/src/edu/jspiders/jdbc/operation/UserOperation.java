package edu.jspiders.jdbc.operation;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.print.attribute.standard.PresentationDirection;

public class UserOperation {
	private  Driver driver;
	private  Connection connection;
	private  PreparedStatement preparedStatement;
	private ResultSet resultSet;
	
	
	private  void openConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcqspiders","root","1234");
	}

	private  void closeConnection() throws SQLException {
		if (preparedStatement != null)
			preparedStatement.close();
		if (connection != null)
			connection.close();
		if (driver != null)
			DriverManager.deregisterDriver(driver);
	}

	public void signUp() throws ClassNotFoundException, SQLException {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter user id");
			int id = scanner.nextInt();
			
			System.out.println("Enter user username");
			String name = scanner.next();
			
			System.out.println("Enter user emailID");
			String email = scanner.next();
			
			System.out.println("Enter user mobile number");
			long number = scanner.nextLong();
			
			System.out.println("Enter user password");
			String password = scanner.next();
			
			openConnection();
			preparedStatement = connection.prepareStatement("INSERT INTO uers VALUES(?,?)");
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, email);
			preparedStatement.setLong(4, number);
			preparedStatement.setString(5, password);
			preparedStatement.execute();
			
		} finally {
			
			closeConnection();
		}
		
		
	}
	
	public void login() throws ClassNotFoundException, SQLException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter user email");
		String email = scanner.next();
		
		System.out.println("Enter user password");
		String password=scanner.next();
		
		try {
			openConnection();
			
		} finally {
			
		}
	}

}
