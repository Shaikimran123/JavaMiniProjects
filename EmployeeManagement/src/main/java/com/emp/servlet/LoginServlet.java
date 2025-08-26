package com.emp.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.emp.dao.UserDao;
import com.emp.modal.User;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String pass = request.getParameter("password");
		User user=new User(email,pass);
		UserDao dao=new UserDao();
		boolean isValid = dao.validateUser(user);
		if(isValid)
		{
			HttpSession session = request.getSession();
			String name=user.getEmail().split("@")[0];
			session.setAttribute("email", name);;
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("Employees");
			requestDispatcher.forward(request, response);
		}
		else
		{
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.html");
			requestDispatcher.forward(request, response);
		}
		
		
	
	}

}
