package com.array;
import java.util.HashSet;

public class Duplicate {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,2,3,1,4,6,2,1,2,3,4,1,2,3,4,6};
		
		HashSet <Integer> unique=new HashSet<>();
		HashSet <Integer> duplicate=new HashSet<>();
		
		for(int r:arr) {
			if(unique.contains(r)) {
			   duplicate.add(r);
			}else {
				unique.add(r);
			}
		}
		System.out.println("Duplicates :"+duplicate);
	}

}
