package com.operators;

public class Swap {
	

	public static void main(String[] args) {
		
		//without temp var
		int a=10;
		int b=5; 
		
		a=a+b;
		b=a-b;
		System.out.println("b: "+b);
		a= a-b;
		System.out.println("a: "+a);
		
		
		//using temp var 
		//int temp=a;
		//System.out.println(temp);
		//a=b;
		//System.out.println(a);
		
		//b=temp;
		//System.out.println(b);
		
	
		}

}
