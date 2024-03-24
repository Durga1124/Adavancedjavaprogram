package com.sathya.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {
	
	public int save(Product product) {
		//Declare the resources
			Connection connection=null;
			PreparedStatement preparedStatement=null;
			int savecount=0;
			try {
				//Get the connection
				connection=DataBaseUtil.createconnection();
				
				System.out.println("success");
				//create the preparedStatement object
				preparedStatement=connection.prepareStatement("insert into product_data values(?,?,?,?,?,?,?,?,?,?)");
				//read the data from preparedStatement object and set to parameters
				preparedStatement.setString(1,product.getProId());
				preparedStatement.setString(2, product.getProName());
				preparedStatement.setDouble(3, product.getProPrice());
				preparedStatement.setString(4, product.getProBrand());
				preparedStatement.setString(5, product.getProMadeIn());
				preparedStatement.setDate(6, product.getProMnfgDate());
				preparedStatement.setDate(7, product.getProExpDate());
				preparedStatement.setBytes(8, product.getProImage());
				preparedStatement.setBytes(9, product.getProAudio());
				preparedStatement.setBytes(10, product.getProVideo());
				savecount=preparedStatement.executeUpdate();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			finally {
				//Before release the connection check the connection is present or not
				try {
					if(connection!=null)
						connection.close();
					if(preparedStatement!=null)
						preparedStatement.close();
				}
				catch ( SQLException e ) {
					e.printStackTrace();
				}
			}
			return savecount;
		}
	
	public List<Product> findAll(){
		
		List<Product> products=new ArrayList<Product>(); 
		Product product=null;
		
		try(Connection connection=DataBaseUtil.createconnection();
				Statement statement=connection.createStatement()){
			ResultSet resultSet=statement.executeQuery("select * from product_data");
			while(resultSet.next()) {
				product=new Product();
				product.setProId(resultSet.getString(1));
				product.setProName(resultSet.getString(2));
				product.setProPrice(Double.parseDouble(resultSet.getString(3)));
				product.setProBrand(resultSet.getString(4));
				product.setProMadeIn(resultSet.getString(5));
				product.setProMnfgDate(resultSet.getDate(6));
				product.setProExpDate(resultSet.getDate(7));
				product.setProImage(resultSet.getBytes(8));
				product.setProAudio(resultSet.getBytes(9));
				product.setProVideo(resultSet.getBytes(10));
				products.add(product);
		}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return products;
	}
	
	//delete by id
	
	public int deleteById(String id)
	{
		//delete the record based on id
		int delcount=0;
		try(Connection connection=DataBaseUtil.createconnection();
				PreparedStatement ps=connection.prepareStatement("delete from product_data where PROId=?"))
		{
			ps.setString(1, id);
			delcount=ps.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return delcount;
	}
	public Product findById(String proId) {
		
		Product product=null;
		try(Connection connection=DataBaseUtil.createconnection();
			PreparedStatement ps=connection.prepareStatement("select * from product_data where PROId=?"))
		{
			System.out.println("connect success");
			ps.setString(1,proId);
			ResultSet resultSet=ps.executeQuery();
			
			if(resultSet.next()) {
				product=new Product();
				product.setProId(resultSet.getString(1));
				product.setProName(resultSet.getString(2));
				product.setProPrice(Double.parseDouble(resultSet.getString(3)));
				product.setProBrand(resultSet.getString(4));
				product.setProMadeIn(resultSet.getString(5));
				product.setProMnfgDate(resultSet.getDate(6));
				product.setProExpDate(resultSet.getDate(7));
				product.setProImage(resultSet.getBytes(8));
				product.setProAudio(resultSet.getBytes(9));
				product.setProVideo(resultSet.getBytes(10));
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return product;
	}
	
	public int updateById(Product product)
	{
		int result =0;
		try(Connection connection=DataBaseUtil.createconnection();
				PreparedStatement preparedStatement=connection.prepareStatement("update product_data set proName=?,proPrice=?,proBrand=?,proMadeIn=?,proMfgdate=?,proExpdate=?,proImage=? where proId=?"))
		{
			preparedStatement.setString(1, product.getProName());
			preparedStatement.setDouble(2, product.getProPrice());
			preparedStatement.setString(3,product.getProBrand());
			preparedStatement.setString(4, product.getProMadeIn());
			preparedStatement.setDate(5, product.getProMnfgDate());
			preparedStatement.setDate(6, product.getProExpDate());
			preparedStatement.setBytes(7, product.getProImage());
			preparedStatement.setString(8,product.getProId());
			preparedStatement.setBytes(9,product.getProAudio());
			preparedStatement.setBytes(10,product.getProVideo());
			
			result=preparedStatement.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return result;
	}
	
}



