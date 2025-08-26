package com.emp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.emp.modal.User;
import com.emp.utils.Constants;
import com.emp.utils.DBconnections;

public class UserDao {
	Connection connection;
	
	public void saveUser(User user) {
		
		
		try {
			connection = DBconnections.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.INSERT_USER);
			statement.setString(1,user.getEmail());
			statement.setString(2, user.getPassword());
			statement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		
		}
	}
	
	public boolean validateUser(User user)
	{
		try {
		connection = DBconnections.getConnection();
		PreparedStatement statement = connection.prepareStatement(Constants.GET_USER);
		statement.setString(1, user.getEmail());
		ResultSet rs = statement.executeQuery();
		String email=null, pass=null;
		while(rs.next())
		{
			email = rs.getString(1);
			pass = rs.getString(2);
		}
		return (user.getEmail().equals(email) && user.getPassword().equals(pass));
		
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		
		}
		return false;
	}
	

}
