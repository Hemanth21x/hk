package com.array;

public class AllZeros {

	public static void main(String[] args) {
		int []a = {2,0,5,3,9,0,1};
		int temp=0;
		
		for(int i =0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]==0) {
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				}
				
			}
		}
		for(int n:a) {
			System.out.print(n+" ");
		}
	}

}
