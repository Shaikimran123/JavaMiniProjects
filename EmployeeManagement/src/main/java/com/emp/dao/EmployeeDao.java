package com.emp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.emp.modal.Employee;
import com.emp.utils.Constants;
import com.emp.utils.DBconnections;

public class EmployeeDao {
	Connection connection=null;
	
	
	public List<Employee> getALlEmployees() {
		List<Employee> employees=new ArrayList<Employee>();
		
		try {
			connection = DBconnections.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.GET_ALL_EMPLOYEES);
			ResultSet rs = statement.executeQuery();
			while(rs.next()){
				int empid = rs.getInt(1);
				String name = rs.getString(2);
				int age=rs.getInt(3);
				String phonenumber=rs.getString(4);
				String email=rs.getString(5);			
				double salary=rs.getDouble(6);
				
				Employee employee=new Employee(empid, name,age,phonenumber,email,salary);				
				employees.add(employee);
			}
			return employees;	
		} 
		catch (ClassNotFoundException  | SQLException e) {
			e.printStackTrace();
			}
		return employees;
		}
	
	
	public void addEmployee(Employee employee){
			
		try {
			connection = DBconnections.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.SAVE_EMP);
			
			statement.setString(1,employee.getName());
			statement.setInt(2, employee.getAge());
			statement.setString(3,employee.getPhonenumber());
			statement.setString(4,employee.getEmail());
			statement.setDouble(5, employee.getSalary());
			
			statement.executeUpdate();

			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	public void DeletEmployee(int empid)
	{
		try {
			connection = DBconnections.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.DELET_EMPLOYEE);
			statement.setInt(1,empid);
			statement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public Employee getEmployee(int empid)
	{
		Connection connection;
		Employee employee=null;
		try {
			connection = DBconnections.getConnection();
			PreparedStatement ps= connection.prepareStatement(Constants.GET_EMPLOYEE);
			ps.setInt(1, empid);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()){
				String name = rs.getString(2);
				int age=rs.getInt(3);
				String phonenumber=rs.getString(4);
				String email=rs.getString(5);
				double salary=rs.getDouble(6);
				
				employee=new Employee(empid, name,age,phonenumber,email,salary);				
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return employee;
	}
	
	
	public void employeeUpdate(Employee e)
	{
		
		try {
			connection = DBconnections.getConnection();
			PreparedStatement statement= connection.prepareStatement(Constants.UPDATE_EMPLOYEE);
			statement.setString(1,e.getName());
			statement.setInt(2, e.getAge());
			statement.setString(3, e.getPhonenumber());
			statement.setString(4, e.getEmail());
			statement.setDouble(5, e.getSalary());

			statement.setInt(6, e.getEmpid());
			
			statement.executeUpdate();
			
			
			
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
		
	
	}

}
