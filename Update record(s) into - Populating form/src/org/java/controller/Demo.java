package org.java.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;
import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Servlet implementation class Demo
 */
@WebServlet("/Demo")
public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Resource(name = "jdbc/project")
	private DataSource dataSource;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Step 1: Initialize connection objects
		PrintWriter out = response.getWriter();
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
					out.print("<br/>" + resultset.getString("email"));
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
	}

}
