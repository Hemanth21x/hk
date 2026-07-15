package com.collections;

import java.util.ArrayList;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		
		list.add(10);
		list.add(15);
		list.add(8);
		list.add(5);
		list.add(12);
		list.add(7);
		
		System.out.println(list);
		
		
		int max=Integer.MIN_VALUE;
		int secondmax=Integer.MAX_VALUE;
		
		for(int i=0;i<list.size();i++) {
	        
			if(list.get(i)>max) {
				secondmax=max;
				max=list.get(i);
			}else if(list.get(i)>secondmax&&list.get(i)!=max) {
					secondmax=list.get(i);
				
			}
			
		}
		System.out.println("Max value : "+max);
        System.out.println("SecondMax : "+secondmax);
	}

}
