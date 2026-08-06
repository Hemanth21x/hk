package com.arraypatterns;

public class Dhoni {

	public static void main(String[] args) {
		
		int n = 5;
		 
		char[][] ref=new char[n][n];
		
		String str="DHONI";
		char c= 'A';
		
		for(int i =0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) {
					ref[i][j]=str.charAt(i);
				}else if((i+j)==4) {
					ref[i][j]=str.charAt(4-j);
				}else {
					ref[i][j]=c++;
				}
			}
		}
   for(char c1[]:ref) {
	   for(char c2:c1) {
		   System.out.print(c2+" ");
	   }
	   System.out.println();
      }
	}

}
