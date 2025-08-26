package com;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello")
public class helloServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//		RequestDispatcher requestDispatcher = request.getRequestDispatcher("loginform.html");
//		requestDispatcher.forward(request, response);
		
		RequestDispatcher requestDispatcher2 = request.getRequestDispatcher("loginform2.html");
		requestDispatcher2.forward(request, response);
		
		
		
		
		
	}

	
}
