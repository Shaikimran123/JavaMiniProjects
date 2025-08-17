package com.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.constants.Constants;

public class JDBCUtil {
	
	Connection connection=null;

	
	public  Connection getConnection() throws SQLException {
			
		if(connection==null) {
		 connection = DriverManager.getConnection(Constants.url, Constants.username, Constants.password);
		}
	return connection;
	}
}



