package com.array;

public class SelectionSort {

	public static void main(String[] args) {
		int [] arr= {3,7,1,5,4,2};
		int temp=0;
		
		for(int i =0;i<arr.length;i++) {
			int minIndex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
		}
		for(int n:arr) {
			System.out.print(n+" ");
		}
	}

}
