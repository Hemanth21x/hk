package com.array;

import java.util.Scanner;

public class SearchElement {
	static boolean issearch(int[] a,int size,int search) {
		boolean flag=false;
		
		for(int i =0;i<size;i++) {
			if(a[i]== search) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size : ");
		int size =sc.nextInt();
		int [] a = new int[size];
		
		System.out.println("Enter the array Numbers : ");
		
		for(int i =0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter a number to Search : ");
		int search =sc.nextInt();
		
		boolean flag =issearch(a,size, search);
		
		if(flag) {
			System.out.println("Element found");
		}else {
			System.out.println("Element not found");
		}
		
		
		sc.close();
	}

}
