package com.exceptionhandling;

public class TestDemo1 {

	public static void main(String[] args) {
		System.out.println("Program Started");
		try {
			try {
				String s=null;
				System.out.println(s.length());
			}catch(NullPointerException e1) {
				System.out.println("String is null");
			}
			int result=10/0;
			System.out.println(result);
			
		}catch(ArithmeticException e){
			System.err.println("Cannot divide by zero");
			
		}
		System.out.println("Program ended");

	}

}
