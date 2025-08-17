package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DMLOperations {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		//1. register your driver(Optional)
		//Class.forName("com.mysql.cj.jdbc.Driver");
		//System.out.println("Driver Registered...");
		
		String url="jdbc:mysql://localhost:3306/emp";
		String username="root";
		String password="Imran@5a9";
		//2. Establish connection
		Connection connection = DriverManager.getConnection(url, username, password);
		//3. create stmt
		Statement statement = connection.createStatement();
		//4. prepare sql smt
		//insertQuery(statement);
		//updateQuery(statement);
		//deleteQuery(statement);
	
		
	}

	private static void deleteQuery(Statement statement) throws SQLException {
		String query="delete from stud where id=2";
		statement.execute(query);
		System.out.println("deleted..");
	}

	private static void updateQuery(Statement statement) throws SQLException {
		String query="update stud set age=20 where id=2";
		statement.execute(query);
		System.out.println("updated..");
	}

	private static void insertQuery(Statement statement) throws SQLException {
		String query="insert into stud values(3,'imranSoor',26)";	
		//5. execute
		statement.execute(query);
		System.out.println("inserted..");
	}

}
