package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//read the data
		String Username=request.getParameter("username");
		String Password=request.getParameter("password");
		String Email=(request.getParameter("email")); 
		long Number=Long.parseLong(request.getParameter("mobile"));
		String gender=request.getParameter("gender");
		String dob=request.getParameter("dob");
		String[] Qualification =request.getParameterValues("qualification");
		String Country=request.getParameter("country");
		String[] Languages=request.getParameterValues("languages");
		String comments=request.getParameter("comments");
		
		//step2 process the data
		
		String q=  String.join(".", Qualification);
		String l=  String.join(".", Languages);
		
		//step3 render the data
		
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("yourname....:"+Username +"<br>");
		writer.println("Password....:"+Password +"<br>");
		writer.println("youremail....:"+Email +"<br>");
		writer.println("Mobilenumber....:"+Number +"<br>");
		writer.println("Gender....:"+gender +"<br>");
		writer.println("DOB....:"+dob +"<br>");
		writer.println("Qualification....:"+Qualification +"<br>");
		writer.println("Country....:"+Country +"<br>");
		writer.println("Languages....:"+Languages +"<br>");
		writer.println("Comments....:"+comments +"<br>");
		writer.println("</body>");
		writer.println("</html>");
		
		
		
		
		
	}

}
