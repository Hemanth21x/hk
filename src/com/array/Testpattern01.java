package com.array;

public class Testpattern01 {

	public static void main(String[] args) {
		
		for(int i =1;i<=5;i++) {
			
			for(int j=5;j>i;j--) {
				System.out.print(" ");
				//System.out.print(j);
			}
			for(int k=1;k<=i;k++) {
				//System.out.print(k);
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
