package com.array;

import java.util.Scanner;

public class RevArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array Size : ");
		int size=sc.nextInt();
		int []a=new int[size];
		
		System.out.println("Enter array numbers : ");
		
		for(int i =0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Array in reverse order : ");
		for(int i =size-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
	
	
		sc.close();

	}

}
