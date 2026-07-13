package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DispRecord {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommarerce","root","root");
			
			String sql="select*from products";
	  		
			PreparedStatement  ps=con.prepareStatement(sql);
			
			ResultSet rs =ps.executeQuery();
			
			while(rs.next()) {
				System.out.println("product id:"+rs.getInt("product_id"));
				System.out.println("product Name : "+rs.getString("product_name"));
				System.out.println("Category : "+rs.getString("category"));
				System.out.println("price : "+rs.getFloat("price"));
				System.out.println("---------------------------------------");
				
			}
			rs.close();
			ps.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
