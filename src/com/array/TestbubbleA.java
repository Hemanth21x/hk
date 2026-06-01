package com.array;

public class TestbubbleA {

	public static void main(String[] args) {
		int [] arr= {2,1,70,5,8,6};
		int temp=0;
		System.out.println("Assending Array!");
		for(int i =0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;

					for (int a:arr) {
						System.out.print(a+" ");
						
					}
					System.err.println();
				}
			}
		}
		
	}

}
