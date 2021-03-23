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

	public void addUser(DataSource dataSource, User newUser) {
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
			statement.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
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

	public void updateUser(DataSource dataSource, User updatedUser) {
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			connection = dataSource.getConnection();
			int usersId = updatedUser.getUser_id();
			String username = updatedUser.getUsername();
			String email = updatedUser.getEmail();
			String query = "update users set username = ?, email= ? where user_id = ? ";
			statement = connection.prepareStatement(query);
			statement.setString(1, username);
			statement.setString(2, email);
			statement.setInt(3, usersId);
			statement.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
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
