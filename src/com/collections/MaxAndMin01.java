package com.collections;

import java.util.ArrayList;
import java.util.List;


//Write a Java program to find the maximum and minimum elements in an ArrayList.
//Input:5
//25 10 45 5 30
//Output:Maximum element: 45
//Minimum element: 5

public class MaxAndMin01 {

	public static void main(String[] args) {
		
		List<Integer> l= new ArrayList<>();
		l.add(20);
		l.add(99);
		l.add(51);
		l.add(76);
		l.add(80);
		 
	System.out.println(l);
	
	int max =Integer.MIN_VALUE;
	int min=Integer.MAX_VALUE;
	
	for(int i=0;i<l.size();i++) {
		if(l.get(i)>max) {
			max=l.get(i);
		}
		if(l.get(i)<min) {
			min=l.get(i);
		}
	}
System.out.println("max value :"+max);
System.out.println("min value :"+min);
	}


}
