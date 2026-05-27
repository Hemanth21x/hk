package com.array;

public class TestCopying {

	public static void main(String[] args) {
		int []a= {8,4,7,4,9,1};
	    int size= a.length;
	    int []b= new int[size];
	    
	    for( int i=0;i<a.length;i++) {
	    		b[i]=a[i];
	    }
	    System.out.println("Original array !");
	    for(int o:a) {
	    	System.out.print(o+" ");
	    }
	    
	    System.out.println();
	    System.out.println("copy array !");
	    for(int c:b) {
	    	System.out.print(c+" ");
	    }
	   }
	}


