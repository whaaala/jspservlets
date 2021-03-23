package org.java.module;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

import org.java.entity.User;

public class UsersModule {

	public List<User> listUsers(DataSource dataSource) {
		// Step 1: Initialize connection objects
		List<User> listUsers = new ArrayList<>();
		Connection connect = null;
		Statement statement = null;
		ResultSet resultset = null;
		
		try {
			connect = dataSource.getConnection();
			// Step 2: Create a SQL statements string
			String query = "Select * from users";
			statement = connect.createStatement();
			
			// Step3: Execute SQL query
			resultset = statement.executeQuery(query);
			
			// Step 4: Process the result set
			while(resultset.next()) {
				listUsers.add(new User(resultset.getInt("user_id"), resultset.getString("username"), resultset.getString("email")));
			}	
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return listUsers;
	}

	public Boolean addUser(DataSource dataSource, User newUser) {
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			connection = dataSource.getConnection();
			String username = newUser.getUsername();
			String email = newUser.getEmail();
			String query = "insert into users (username, email) values (?,?) ";
			statement = connection.prepareStatement(query);
			statement.setString(1, username);
			statement.setString(2, email);
			return statement.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}finally {
			try {
				connection.close();
				statement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}

}
