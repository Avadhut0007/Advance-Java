package edu.jspiders.jdbc.operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		//1.load the Drive class
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Driver driver = new com.mysql.cj.jdbc.Driver(); //upcast
				
				//2.Register the driver
				DriverManager.registerDriver(driver);
				
				//3.open connection between 
				Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcqspiders?user=root&password=1234");
				
				//4.create statement
				Statement statement=connection.createStatement();
				
				//5.Execute statement
				boolean res = statement.execute("CREATE TABLE users (id int primary key,"
						+ "name varchar(20) not null,"
						+ "email varchar(20) not null unique,"
						+ "mobile bigint not null unique,"
						+ "password varchar(20) not null)");//DQL true otherwise false
				
				//6.process result
				System.out.println(res);
				System.out.println("Table is created");
				
				//7.Close the connection
				statement.close();
				connection.close();
				
				//de-register the driver
				DriverManager.deregisterDriver(driver);

	}

}
