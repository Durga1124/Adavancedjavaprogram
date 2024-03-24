package com.prasad.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {


		//these method returns the connection and return the connection
		public static Connection createconnection() {
			Connection connection=null;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","prasad","welcome");
				
			}
			catch(ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			return connection;
		}
		
		
	}
