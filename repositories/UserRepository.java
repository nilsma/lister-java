package repositories;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserRepository {
	
	private Connection connection;
	
	public UserRepository(Connection connection) {
		this.connection = connection;
	}
	
	public String getUsername(int userId) {
		
		String username = "";
		String query = "SELECT username FROM users WHERE id=" + userId;
		ResultSet resultSet = null;
		
		try {
			Statement statement = connection.createStatement();
			resultSet = statement.executeQuery(query);
			username = resultSet.getString(2);
		} catch(SQLException exception) {
			System.out.println("Error in UserRepository getUsername(userId)");
			System.out.println(exception.getMessage());
			System.exit(0);
		}
		
		return username;
	}

}
