package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ProductRecord {

	public static void main(String[] args) {
		System.out.println("program started");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommarerce","root","root");
			String sql="insert into products(product_id,product_name,category,price)values(?,?,?,?)";
			
			PreparedStatement ps=con.prepareStatement(sql);
			System.out.println("Statement");
			ps.setInt(1,102);
			ps.setString(2, "Hemanth");
			ps.setString(3,"Street");
			ps.setFloat(4,76658.0f);
			
			int rs=ps.executeUpdate();
		    System.out.println(rs + "Record Inserted Successfully");

			
			ps.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
