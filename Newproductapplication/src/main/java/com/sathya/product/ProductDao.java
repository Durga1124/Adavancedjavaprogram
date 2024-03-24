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
				//create the preparedStatement object
				preparedStatement=connection.prepareStatement("insert into product_data values (?,?,?,?,?,?,?,?)");
				//read the data from preparedStatement object and set to parameters
				preparedStatement.setString(1,product.getProId());
				preparedStatement.setString(2, product.getProName());
				preparedStatement.setDouble(3, product.getProPrice());
				preparedStatement.setString(4, product.getProBrand());
				preparedStatement.setString(5, product.getProMadeIn());
				preparedStatement.setDate(6, product.getProMnfgDate());
				preparedStatement.setDate(7, product.getProExpDate());
				preparedStatement.setBytes(8, product.getProImage());
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
		try(Connection connection=DataBaseUtil.createconnection();
				Statement statement=connection.createStatement()){
			ResultSet resultSet=statement.executeQuery("select * from product_data");
			while(resultSet.next()) {
				Product product=new Product();
				product.setProId(resultSet.getString(1));
				product.setProName(resultSet.getString(2));
				product.setProPrice(Double.parseDouble(resultSet.getString(3)));
				product.setProBrand(resultSet.getString(4));
				product.setProMadeIn(resultSet.getString(5));
				product.setProMnfgDate(resultSet.getDate(6));
				product.setProExpDate(resultSet.getDate(7));
				product.setProImage(resultSet.getBytes(8));
				products.add(product);
		}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return products;
	}
}