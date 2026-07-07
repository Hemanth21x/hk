package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Emptest01 {
	

	public static void main(String[] args) {
	
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommarerce","root","root");
			
		   PreparedStatement ps = con.prepareStatement(" insert into products(product_id,product_name,category,price)Values(?,?,?,?)");
		   ps.setInt(1,101);
		   ps.setString(2,"shoes");
		   ps.setString(3,"fashion");
		   ps.setFloat(4, 60000.0f);
		   
		   int rs = ps.executeUpdate();
		   System.out.println(rs + "Record inserted succesfully");
		   
		 
		   
		   ps.close();
		   con.close();
		   
		} catch (Exception e) {
		e.printStackTrace();
		
		}

	}

}
