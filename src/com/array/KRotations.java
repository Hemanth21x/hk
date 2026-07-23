package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class KRotations {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5}; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of Rotations");
		int r = sc.nextInt();
		
		int k = r%arr.length;
		
		rotation(arr,k);
		System.out.println(Arrays.toString(arr));
		sc.close();
		

	}

	private static void rotation(int[] arr, int k) {
		reverse(arr,0,arr.length-1);
		
		reverse(arr,0,k-1);
		reverse(arr,k,arr.length-1);
		
	}

	private static void reverse(int[] arr, int i, int j) {
		
		int temp = 0;
		
		while(i<j) {
			temp =arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
	}
	

}
