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
		ResultSet rs = null;
		
		try {
			connect = dataSource.getConnection();
			// Step 2: Create a SQL statements string
			String query = "Select * from users";
			statement = connect.createStatement();
			
			// Step3: Execute SQL query
			rs = statement.executeQuery(query);
			
			// Step 4: Process the result set
			while(rs.next()) {
				listUsers.add(new User(rs.getInt("user_id"), rs.getString("username"), rs.getString("email")));
			}	
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return listUsers;
	}

}
