package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//step-1 : Read the requested data
		
		 int proId=Integer.parseInt(request.getParameter("proId"));
		 String proName=request.getParameter("proName");
		int proPrice=Integer.parseInt(request.getParameter("proPrice"));
		int proQuantity=Integer.parseInt(request.getParameter("proQuantity"));
		
		//step-2 process the data
		int Totalbill=proPrice * proQuantity;
		double netprice,discount=0;
		String status;
		if( Totalbill<1000) {
			netprice=Totalbill;
		}
		else if(Totalbill>100 && Totalbill<5000) {
			discount=Totalbill*0.5;
		netprice=Totalbill-discount;
		}
		else if(Totalbill>5000 && Totalbill<10000) {
			discount=Totalbill*0.1;
		netprice=Totalbill-discount;
		}
		else {
			discount=Totalbill*0.15;
		netprice=Totalbill-discount;
		}
		/// Render the Response  to client
		
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		writer.println("<html>");
		writer.println("<body bgcolor=pink>");
		writer.println("<br><br>");
		writer.println("Product id="+proId);
		writer.println("<br><br>");
		writer.println("Product name="+proName);
		writer.println("<br><br>");
		writer.println("Product price="+proPrice);
		writer.println("<br><br>");
		writer.println("Product Quantity="+proQuantity);
		writer.println("<br><br>");
		writer.println("Product totalbill.....="+Totalbill);
		writer.println("<br><br>");
		writer.println("Product discount.....="+discount);
		writer.println("<br><br>");
		writer.println("Product netprice.....="+netprice);
		writer.println("<br><br>");
		writer.println("</html>");
		}
}
