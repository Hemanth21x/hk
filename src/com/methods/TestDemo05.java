package com.methods;

//Calculate Simple Interest

public class TestDemo05 {

	public void interst(int p,int t,int r) {
		System.out.println("simple interst"+(p* t * r) / 100);
		
	}

	public static void main(String[] args) {

		TestDemo05 ref = new TestDemo05();
		ref.interst(10000, 2, 5);

	}

}
