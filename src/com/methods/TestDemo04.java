package com.methods;
import java.util.Scanner;

public class TestDemo04 {
	
	public void mul(int n,int n1) {
		for(int i=1;i<=n1;i++) {
		System.out.println(n+"x"+i+"="+n*i);
	}
	}
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the table : ");
		int n = sc.nextInt();
		
		System.out.println("Enter the range: ");
		int n1 = sc.nextInt();
		
		TestDemo04 ref = new TestDemo04();
		
		ref.mul(n,n1);
		
		 
	}

}
