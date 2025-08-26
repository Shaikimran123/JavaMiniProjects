package com.emp.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.emp.dao.EmployeeDao;
import com.emp.modal.Employee;

@WebServlet("/Employees")
public class EmployeeServlet extends HttpServlet {
	

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		EmployeeDao dao=new EmployeeDao();
		
		List<Employee> allEmployees= dao.getALlEmployees();
		request.setAttribute("emplist", allEmployees);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("employees.jsp");
		requestDispatcher.forward(request, response);
		
		
	}

}
