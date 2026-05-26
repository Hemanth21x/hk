package com.operators;

public class Arthematic {
	
	int add(int a,int b) {
	 return a+b;	
	}
	int sub(int a,int b) {
	 return a-b;		
	}
	int mul(int a,int b) {
		return a*b;	
	}
	int div(int a,int b) {
		return a/b;	
	}
	int mod(int a,int b) {
		return a%b;	
	}
	
	void show() {
		System.out.println("add : "+add(19,45));
		System.out.println("sub : "+sub(16,17));
		System.out.println("mul : "+mul(65,78));
		System.out.println("div : "+div(34,76));
		System.out.println("mod : "+mod(65,84));
		}

	public static void main(String[] args) {
		Arthematic ref = new Arthematic();
		ref.show();

	}

}
