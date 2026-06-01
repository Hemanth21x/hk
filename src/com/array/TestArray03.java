package com.array;

public class TestArray03 {
	public static void main(String[] args) {

		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		for (int i = 0; i < a.length; i++) {
			int temp = 0;
			if (i % 2 == 0) {
				for (int j = 0; j < a[i].length / 2; j++) {
					temp = a[i][j];
					a[i][j] = a[i][a[i].length - j - 1];
					a[i][a[i].length - j - 1] = temp;

				} 
			}else {
					for(int k=0;k<a[i].length;k++) {
						if(i==k) {
							continue;
						}
	
						a[i][k]=a[i][k]*2;
						
					}
				} 
				for(int j=0;j<a[i].length;j++) {
					if(i==j) {
						a[i][j]=a[i][j]*a[i][j];
					}
					
				}

			}
		
		
		for (int[] n1 : a) {
			for (int n : n1) {
				System.out.print(n + " ");
			}
			System.out.println();
		}

	}

}
