package com.array;

import java.util.Scanner;

public class RotationArray {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
		
		 System.out.println("Enter a number to rotation :");
		 int r = sc.nextInt();
		
		int []arr= {1,2,3,4,5,6,7,8};
		arrayRotation(arr,r);
	}
	
		
        static void arrayRotation(int[] arr,int r) {
        	int start=0;
    		int end = arr.length-1;
    		arrayReverse(arr,start,end);
    		arrayReverse(arr,start,r-1);
     	arrayReverse(arr,r,end);
    		System.out.println("After sorting!");
    		for(int n : arr) {
    			System.out.print(n+" ");
    		}

        }
		
		static void arrayReverse(int[] arr,int start,int end) {	
			
			int temp=0;
			while(end>start) {
				temp =arr[end];
				arr[end]=arr[start];
				arr[start]=temp;
				start++;
				end--;
			}
	
		}
		
}
