package com.emp.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.emp.dao.EmployeeDao;


@WebServlet("/delet")
public class DeletServelet extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int Empid = Integer.parseInt(request.getParameter("id"));
		EmployeeDao dao=new EmployeeDao();
		dao.DeletEmployee(Empid);
		
//		RequestDispatcher requestDispatcher = request.getRequestDispatcher("Employees");
//		requestDispatcher.forward(request, response);
		
		response.sendRedirect("Employees");
		
		
	}

}
