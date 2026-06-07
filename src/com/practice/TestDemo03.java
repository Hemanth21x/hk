package com.practice;

public class TestDemo03 {

	public static void main(String[] args) {
		int []a= {10,20,30,40,50};
		int []b= {1,2,3};
		int []c= new int[a.length];
		
		for(int i=0;i<b.length;i++) {
				c[i]=a[i]+b[i];
			}
		for (int i=b.length;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int n:c) {
			System.out.println(n+" ");
		}

	}

}
