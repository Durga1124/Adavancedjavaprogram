package com.sathya.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseUtil {
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