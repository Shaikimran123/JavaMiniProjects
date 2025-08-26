package com;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


@WebServlet("/session")
public class sessionScopeServlet extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String username= request.getParameter("username");
		String pass= request.getParameter("password");

		/*key-values pair we are setting attributes.
		request.setAttribute("name", username);
		request.setAttribute("password", pass);
		*/
		
		request.setAttribute("name", username);
		//application context scope.
		
		ServletContext servletContext = request.getServletContext();
		servletContext.setAttribute("name", username);
		
		
		//session scope
		HttpSession session = request.getSession();
		session.setAttribute("password",pass);
		
		
	
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("results2.jsp");
		requestDispatcher.forward(request, response);
		
	
	}

	
}
