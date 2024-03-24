package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			
			int num1=Integer.parseInt(request.getParameter("first"));
			int num2=Integer.parseInt(request.getParameter("second"));
			String operation=(request.getParameter("operation"));
			int result=0;
			switch(operation)
			
			{
			case "+":result=num1+num2;
			break;
			case "-":result=num1-num2;
			break;
			case "*":result=num1*num2;
			break;
			case "/":result=num1/num2;
			break;
			case "%":result=num1%num2;
			break;
			}
			
			response.setContentType("text/html");
			PrintWriter writer=response.getWriter();
			writer.println("<html>");
			writer	.println("<body bgcolor=lightblue>");
			writer.println("<h1>PERFORMING CALCULATIONS @RESULTS..........</h1>");
			writer.println("The first number.."+num1+"<br><br>");
			writer.println("The second number.."+num2+"<br><br>");
			writer.println("The  operation is.."+operation+"<br><br>");
			writer.println("The result="+result+"<br><br>");
			writer.println("</html>");
			}
			
		
		}