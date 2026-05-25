package com.array;

public class TestDemo2 {

	public static void main(String[] args) {
		int [] a= {10,10,20,20,30,30,40,40,50,50};
		int sum=0;
		int avg =0;
		int largest=a[0];
		int secondlargest=a[0];
		int secondsmallest=Integer.MAX_VALUE;
		int smallest=a[0];
		
		
		
		for(int i=0;i<a.length;i++) {
		   sum=sum+a[i];
		   avg=sum/3;
		   
	
		   if(a[i]>largest) {
			   secondlargest=largest;
			   largest=a[i];
		
		   }else if(a[i]>secondlargest&&a[i]!=largest){
			   secondlargest=a[i];
			   
		   }
		   if(a[i]<smallest) {
			   secondsmallest=smallest;
			   smallest=a[i];
			   } else if(a[i]<secondsmallest&&a[i]!=smallest) {
				  secondsmallest=a[i]; 
			   }
			  
		    
		}
		
		System.out.println("sum = "+sum);
		System.out.println("avg = "+avg);
		System.out.println("largest element : "+largest);
		System.out.println("Second largest : "+secondlargest);
		System.out.println("smallest number : "+smallest);
		System.out.println("secondsmallest  : "+secondsmallest);
		
	}

}
