package com.JDBC;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.Util.JDBCUtil;

public class DQLOperations {

	public static void main(String[] args)  {

		JDBCUtil jdbcUtil= new JDBCUtil();
		try {
			Connection connection = jdbcUtil.getConnection();
			Statement statement=connection.createStatement();
			
			String query="select * from stud";
			
			ResultSet rs = statement.executeQuery(query);
			System.out.println("sid\tSname\tsgae");
			while(rs.next())
			{
				int sid = rs.getInt(1);
				String sname = rs.getString(2);
				int sage = rs.getInt(3);
				System.out.println(sid+"\t"+sname+"\t"+sage);
			}
		
					
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	

		
	}

}
