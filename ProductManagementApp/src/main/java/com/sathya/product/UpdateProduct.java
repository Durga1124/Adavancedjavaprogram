package com.sathya.product;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.Base64;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.io.IOUtils;


@WebServlet("/UpdateProduct")
public class UpdateProduct extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String proId=request.getParameter("proId");
		String proName=request.getParameter("proName");
		Double proPrice=Double.parseDouble(request.getParameter("proPrice"));
		String proBrand=request.getParameter("proBrand");
		String proMadeIn=request.getParameter("proMadeIn");
		Date proMfgDate=Date.valueOf(request.getParameter("proMfgDate"));
		Date proExpDate=Date.valueOf(request.getParameter("proExpDate"));
		
		
		Product product=new Product();
		product.setProId(proId);
		product.setProName(proName);
		product.setProPrice(proPrice);
		product.setProBrand(proBrand);
		product.setProMadeIn(proMadeIn);
		product.setProMnfgDate(proMfgDate);
		product.setProExpDate(proExpDate);
		
		
		Part part=request.getPart("newProImage");
		
		if(part!=null && part.getSize()>0)
		{
			InputStream inputStream=part.getInputStream();
			//conversion of InputStream into byte[]
			byte[] newProImage = IOUtils.toByteArray(inputStream);
			product.setProImage(newProImage);
		}
		else
		{
			String s=request.getParameter("existingImage");
			byte[] existingImage=Base64.getDecoder().decode(s);
			product.setProImage(existingImage);
			
		}
		
Part part1=request.getPart("newProAudio");
		
		if(part1!=null && part1.getSize()>0)
		{
			InputStream inputStream=part.getInputStream();
			//conversion of InputStream into byte[]
			byte[] newProAudio = IOUtils.toByteArray(inputStream);
			product.setProAudio(newProAudio);
		}
		else
		{
			String s=request.getParameter("existingAudio");
			byte[] existingAudio=Base64.getDecoder().decode(s);
			product.setProAudio(existingAudio);
			
		}
		
Part part2=request.getPart("newProVideo");
		
		if(part2!=null && part2.getSize()>0)
		{
			InputStream inputStream=part.getInputStream();
			//conversion of InputStream into byte[]
			byte[] newProVideo = IOUtils.toByteArray(inputStream);
			product.setProVideo(newProVideo);
		}
		else
		{
			String s=request.getParameter("existingVideo");
			byte[] existingVideo=Base64.getDecoder().decode(s);
			product.setProVideo(existingVideo);
			
		}
			
			
			
		//Giving the product object to DAO layer
		
		ProductDao productDao=new ProductDao();
		int result=productDao.updateById(product);
		
		
		if(result==1)
		{
			//To send the data to JSP, add the data to request object
			request.setAttribute("updateResult", result);
			RequestDispatcher dispatcher=request.getRequestDispatcher("productList.jsp");
			dispatcher.forward(request, response);
		}
		else
		{
			response.setContentType("text/html");
			PrintWriter writer=response.getWriter();
			writer.println("<h1 class='text-danger text-center'>Data Updation Failed, Please check and enter the details again...</h1>");
			RequestDispatcher dispatcher=request.getRequestDispatcher("editForm.html");
			dispatcher.include(request, response);
		}
	}

}

