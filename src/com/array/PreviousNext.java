package com.array;

public class PreviousNext {

	public static void main(String[] args) {
		int [] a= {10,20,30,40,50,60};
		int [] b= new int[a.length];
		
		for(int i=0;i<a.length;i++) {
	          if(i==0) {
	        	  b[i]=a[i]+a[i+1];
			}else if(i==a.length-1) {
				b[i]=a[i]+a[i-1];
			}else {
				b[i]=a[i-1]+a[i+1];
			}
		}
		for(int n:b) {
			System.out.println(n+" ");
		}
	}

}
