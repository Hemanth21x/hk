package com.methods;

public class TestDemo03 {
	public void islarge(int a,int b) {
		if(a>b) {
			System.out.println(a+" is larger!");
		}else {
			System.out.println(b+" is larger");
		}
	}

	public static void main(String[] args) {
		
		TestDemo03 ref = new TestDemo03();
		
		ref.islarge(10,20);
		
	}

}
