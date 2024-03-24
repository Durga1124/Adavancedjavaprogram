package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//Step-1: Read the data
		
		String Username=request.getParameter("username");
		String Password=request.getParameter("password");
		
		//Step-2: Process the data
		
		String status;
		if(Username.equals("sathya")&& Password.equals("sathya@123"))
				{
			status="login sucessfull....";
				}
		else
			
		{
			status="login fail....";
			
		}
		
		//render the response to client
		
		PrintWriter writer=response.getWriter();
		response.setContentType("text/html");
		writer.println("<html>");
		writer.println("<h1>login status...</h1>"+status);
		writer.println("</html>");
	
		
	}

}
