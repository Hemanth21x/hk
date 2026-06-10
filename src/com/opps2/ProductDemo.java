package com.opps2;

class ProdData {
	private int productId;
	private String productName;
	private double price;

	public ProdData(double price) {
		if (price > 0) {
			this.price = price;
		} else {
			System.out.println("Ivalid price");
		}
	}

	public void setproductId(int productId) {
		this.productId = productId;
	}

	public void setproductName(String productName) {
		this.productName = productName;
	}

	public void setprice(double price) {
		if (price > 0) {
			this.price = price;
		} else {
			System.out.println("price must be greater then 0");
		}
	}

	public int getproductId() {
		return productId;
	}

	public String getproductName() {
		return productName;
	}

	public double getprice() {
		return price;
	}

}

public class ProductDemo {

	public static void main(String[] args) {

		ProdData ref = new ProdData(100000);
		ref.setproductId(101);
		ref.setproductName("one plus");

		System.out.println("Product id :" + ref.getproductId());
		System.out.println("Product Price :" + ref.getprice());
		System.out.println("Product Name :" + ref.getproductName());

		System.out.println("************************************");
		ref.setprice(-5000);
//		System.out.println("Product Price : "+ref.getprice());

	}

}
