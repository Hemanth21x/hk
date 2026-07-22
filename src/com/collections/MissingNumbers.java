package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumbers {

	public static void main(String[] args) {
		int n =10;

		List<Integer> list=new ArrayList<>(Arrays.asList(1,2,4,6,7,10));
		List<Integer> missingvalues=new ArrayList<>();
		
		
		for (int i =1;i<n;i++) {
			if(!list.contains(i)) {
				missingvalues.add(i);
			}
		}
		System.out.println("Actual List :"+list);
		System.out.println("Missing Values Are: "+missingvalues);
		
	}


}
