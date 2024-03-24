package com.sathya.product;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;  

import org.apache.commons.io.IOUtils;
@WebServlet("/AddServlet")
@MultipartConfig
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Read the data
		String proId=request.getParameter("proId");
		String proName=request.getParameter("proName");
		double proPrice=Double.parseDouble(request.getParameter("proPrice"));
		
		String proBrand=request.getParameter("proBrand");
		String proMadeIn=request.getParameter("proMadeIn");
		
		Date proMnfgDate=Date.valueOf(request.getParameter("proMnfgDate"));
		Date proExpDate=Date.valueOf(request.getParameter("proExpDate"));
		
		Part part=request.getPart("proImage");
		InputStream inputStream=part.getInputStream();
		
	      //conversion of inputstream to byte array
		byte[] proImage=IOUtils.toByteArray(inputStream);
		
		//taking the input and convert to inputstream and byte array
		Part part1=request.getPart("proAudio");
		InputStream inputStream1=part1.getInputStream();
		byte[] proAudio=IOUtils.toByteArray(inputStream1);
		
		Part part2=request.getPart("proVideo");
		InputStream inputStream2=part2.getInputStream();
		byte[] proVideo=IOUtils.toByteArray(inputStream2);
		
		
		//using the above details create the product object
		Product product=new Product();
		
		product.setProId(proId);
		product.setProName(proName);  
		product.setProPrice(proPrice);
		product.setProBrand(proBrand); 
		product.setProMadeIn(proMadeIn);
		product.setProMnfgDate(proMnfgDate);
		product.setProExpDate(proExpDate);
		product.setProImage(proImage);
		product.setProAudio(proAudio);
		product.setProVideo(proVideo);
		
		//giving the product object into Dao layer
		ProductDao productDao=new ProductDao();
		int result=productDao.save(product);
		
		if(result==1)
		{ //To send the data to JSP file add the data in to request object
		  //request.setAttribute("saveResult", result);
			RequestDispatcher dispatcher=request.getRequestDispatcher("productList.jsp");
			dispatcher.forward(request, response);				
		}
		else
		{
			response.setContentType("text/html");
			PrintWriter writer=response.getWriter();
			writer.println("Data insertion fail check once..."+result);
			RequestDispatcher dispatcher = request.getRequestDispatcher("add-product.html");
			dispatcher.include(request, response);
		}
		
		
	}

}