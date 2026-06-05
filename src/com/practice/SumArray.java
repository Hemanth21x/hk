package com.practice;

public class SumArray {

	public static void main(String[] args) {
	   int []a= {1,2,3,4,5};
	   int sum=0;
	   int max=a[0];
	   int min =a[0];
	   int secondmax=Integer.MIN_VALUE;
	   int secondmin=Integer.MAX_VALUE;
	   for(int i=0;i<a.length;i++) {
		   sum=sum+a[i];
		   
		   if(a[i]>max) {
			   secondmax=max;
			   max=a[i];
			   }else if(a[i]>secondmax&&a[i]!=max){
				   secondmax=a[i];
			   }
		   
		   if (a[i] < min) {
               secondmin = min;
               min = a[i];
           } else if (a[i] < secondmin && a[i] != min) {
               secondmin = a[i];
           }
       }
	   int avg=sum/a.length;
	   System.out.println("Sum of array : "+sum);
	   System.out.println("Avg of array : "+avg);
	   System.out.println("Max of array : "+max);
       System.out.println("Min of array : "+min);
       System.out.println("Secondmax of array : "+secondmax);
       System.out.println("Secondmin of array : "+secondmin);
	  
	}

}
