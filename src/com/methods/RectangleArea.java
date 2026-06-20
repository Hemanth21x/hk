package com.methods;

public class RectangleArea {
	
	public int area(int l,int b) {
		return l*b;
	}

	public static void main(String[] args) {
		RectangleArea ref = new RectangleArea();
		
		System.out.println("Area of rectangle :"+ref.area(10, 5));

	}

}
