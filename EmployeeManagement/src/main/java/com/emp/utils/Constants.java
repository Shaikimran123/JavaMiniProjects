package com.emp.utils;

public class Constants {

	public static final String url ="jdbc:mysql://localhost:3306/webprojects";
	public static final String username ="root";
	public static final String password="Imran@5a9";
	
	public static final String INSERT_USER = "INSERT INTO USERS VALUES(?,?)";

	public static final String GET_USER="select * from users where email=?";
	
	public static final String GET_ALL_EMPLOYEES="Select * from Employees";

	public static final String SAVE_EMP="insert into employees(name, age, phone_number, email,salary) values(?,?,?,?,?)";
			
	public static final String DELET_EMPLOYEE="delete from employees where empid=?";

	public static final String GET_EMPLOYEE="select * from employees where empid=?";

	public static final String UPDATE_EMPLOYEE = 
		    "UPDATE employees SET name=?, age=?, phone_number=?, email=?, salary=? WHERE empid=?";	

}
