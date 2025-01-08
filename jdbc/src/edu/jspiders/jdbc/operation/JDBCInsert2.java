package edu.jspiders.jdbc.operation;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCInsert2 {

	private static Driver driver;
	private static Connection connection;
	private static PreparedStatement preparedStatement;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try {
			openConnection();
			preparedStatement = connection.prepareStatement("INSERT INTO users VALUES(?,?,?,?,?)");
			preparedStatement.setInt(1, 2);
			preparedStatement.setString(2, "Mahesh");
			preparedStatement.setString(3, "mahesh@gmail.com");
			preparedStatement.setLong(4, 7778886534l);
			preparedStatement.setString(5, "Suresh@123");
			int rows = preparedStatement.executeUpdate();
			System.out.println(rows + " row(s) affected");
		} finally {
			closeConnection();
		}

	}

	private static void openConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcqspiders?user=root&password=1234");
	}

	private static void closeConnection() throws SQLException {
		if (preparedStatement != null)
			preparedStatement.close();
		if (connection != null)
			connection.close();
		if (driver != null)
			DriverManager.deregisterDriver(driver);
	}

}
