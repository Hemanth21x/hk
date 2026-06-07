package com.array;

public class LeaderElement {
		public static void main(String []args) {
			int []a= {16,17,4,3,2};
			
			for(int i=0;i<a.length;i++) {
				int count=0;
				for(int j=i+1;j<a.length;j++) {
				if(a[j]>=a[i]) {
					count++;
					break;
				}
				}
				if(count==0) {
					System.out.println(a[i]+" ");
				}
			}
		}
}
