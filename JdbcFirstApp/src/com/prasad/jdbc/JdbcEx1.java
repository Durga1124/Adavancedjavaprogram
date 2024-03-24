package com.prasad.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//Step1:load the driver
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
		System.out.println("Driver Loaded Successfully...");
		
		//Step2:Create the connection
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe","prasad","welcome");
		System.out.println("connection created successfully...");
		
		//Step3:procees the query connection
		
		Statement statement= connection.createStatement();
		
		String q1="create table emp1(id number,name varchar2(30),salary number)";
		int res1=statement.executeUpdate(q1);
		System.out.println("Table created sucessfully...."+res1);
		
		String q2="drop table emp1";
		int res2=statement.executeUpdate(q2);
		System.out.println("Table dropped sucessfully...."+res2);
			
		//Step4:close the connection
		connection.close();
		System.out.println("connection close successfully...");
	}

}
