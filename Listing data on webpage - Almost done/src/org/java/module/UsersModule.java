package org.java.module;

import java.sql.Connection;
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

	public void addUser(User newUser) {
		
	}

}
