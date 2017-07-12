package it.martinussen.lister;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	
	private static String driverName = "com.mysql.jdbc.Driver";
	private static String username = "lister";
	private static String password = "asdflkj";
	private static String connectionUrl = "jdbc:mysql://localhost:3306/lister?useSSL=false";
	
	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName(driverName);
			
			try {
				connection = DriverManager.getConnection(connectionUrl, username, password);	
			} catch(SQLException exception) {
				System.out.println("Failed to create the database connection:");
				System.out.println(exception.getMessage());
				System.exit(0);
			}
			
		} catch(ClassNotFoundException exception) {
			System.out.println("Driver not found:");
			System.out.println(exception.getMessage());
			System.exit(0);
		}
		
		return connection;
	}
	
	/*
	private Connection connection;
	private static String username = "lister";
	private static String password = "asdflkj";
	private static String connectionUrl = "jdbc:mysql://localhost:3306/lister";
	
	public Connection getConnection() {
		
		if (connection == null) {
			return createConnection();
		}
		
		return connection;

	}
	
	public Connection createConnection() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(
					connectionUrl,
					username,
					password
					);
			
		} catch(Exception exception) {
			System.out.println("Something went wrong: " + exception.getMessage());
			System.exit(0);
		}
		
		return connection;
	}
	*/

}
