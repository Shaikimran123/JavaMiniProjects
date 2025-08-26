package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/signup")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String uname = request.getParameter("usename");
		String password = request.getParameter("password");

		
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		writer.append("Hi "+uname+" ur successfully registered");
	
	
	
	}

}
