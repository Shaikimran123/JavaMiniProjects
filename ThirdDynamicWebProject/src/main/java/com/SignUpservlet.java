package com;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/signup")
public class SignUpservlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String username= request.getParameter("username");
	String pass= request.getParameter("password");

	//key-values pair we are setting attributes.
	request.setAttribute("name", username);
	request.setAttribute("password", pass);
	
	
	RequestDispatcher requestDispatcher = request.getRequestDispatcher("result.jsp");
	requestDispatcher.forward(request, response);
	
	/*we can incluse the jsp pages , heew we can add hedder/footer jsp's.
	RequestDispatcher dispatcher = request.getRequestDispatcher("header.jsp");
	dispatcher.include(request, response); */
	
	
		
	}

}
