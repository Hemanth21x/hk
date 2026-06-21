package com.methods;

import java.util.Scanner;


public class TestDemo05 {
	public void fact(int n) {
		int n1=0; int n2=1;
		for (int i =0; i <n; i++) {
			System.out.print(n1+" ");
			int n3=n1+n2;
			n1=n2;
			n2=n3;
			 }
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a numbers : ");
		int n = sc.nextInt();

		TestDemo05 ref = new TestDemo05();
		ref.fact(n);

	}

}
