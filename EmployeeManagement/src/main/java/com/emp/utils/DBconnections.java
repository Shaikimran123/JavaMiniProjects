package com.emp.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnections {
	
	static	Connection  connection=null;
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		if(connection==null){
			connection = DriverManager.getConnection(Constants.url, Constants.username, Constants.password);			
		}
		return connection;
		
	}
	
}
