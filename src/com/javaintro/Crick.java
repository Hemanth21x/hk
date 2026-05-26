package com.javaintro;
public class Crick {
	// static Blocks
	static {
		System.out.println("Hello static1 ");
	}
	public static void main(String[] args) {
		System.out.println("main method started !!");
		Student s1 = new Student();
		System.out.println("main method ended !!");
		
	}
	// instance blocks
	{
		System.out.println("Hello instance ");
	
	}
}



