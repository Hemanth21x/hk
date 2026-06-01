package com.array;

public class MulArray {

	public static void main(String[] args) {
		int[][]a = {{1,2},{3,4}} ;
		int[][]b = {{5,6},{7,8}};
		int[][]c= new int[2][2];
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
		     c[i][j]=a[i][j]*b[i][j];
			}
		}
		for(int[] n:c) {
			for(int n1:n) {
				System.out.println(n1);
			}
			
		}
		

	}

}
