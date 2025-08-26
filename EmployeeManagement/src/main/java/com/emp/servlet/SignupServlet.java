package com.emp.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.emp.dao.UserDao;
import com.emp.modal.User;
import com.emp.utils.Constants;
import com.emp.utils.DBconnections;


@WebServlet("/signup")
public class SignupServlet extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String email = request.getParameter("email");
		String pass = request.getParameter("password");
		String cp = request.getParameter("confirm-password");
		
		User user=new User(email,pass);
		UserDao dao=new UserDao();
		dao.saveUser(user);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.html");
		requestDispatcher.forward(request, response);
			
			
		
		
	}

}
