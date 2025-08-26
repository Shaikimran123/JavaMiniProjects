package com.emp.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.emp.dao.EmployeeDao;
import com.emp.modal.Employee;


@WebServlet("/update")
public class updateServlet extends HttpServlet {
    
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int empid = Integer.parseInt( request.getParameter("id"));
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String email = request.getParameter("Email");
		String phnnum = request.getParameter("phonenumber");
		double sal = Double.parseDouble(request.getParameter("salary"));
		Employee employee=new Employee(empid, name,age,phnnum,email,sal);
		EmployeeDao dao=new EmployeeDao();
		dao.employeeUpdate(employee);
		response.sendRedirect("Employees");
		
	}

}
