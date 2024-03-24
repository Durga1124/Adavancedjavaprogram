package com.sathya.product;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteProductservlet")
public class DeleteProductservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String proId=request.getParameter("proId");
		ProductDao productDao=new ProductDao();
		int result=productDao.deleteById(proId);
		
		if(result==1)
		{ 
			request.setAttribute("deleteResult", result);
			RequestDispatcher dispatcher=request.getRequestDispatcher("productList.jsp");
			dispatcher.forward(request, response);				
		}
		else
		{
			request.setAttribute("deleteResult", result);
			RequestDispatcher dispatcher = request.getRequestDispatcher("add-product.html");
			dispatcher.forward(request, response);
		}
		
		
	}

}