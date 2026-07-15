package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ReplaceEvenNumbers {

	public static void main(String[] args) {

		List<Integer> list=new ArrayList<>();
		
		list.add(10);
		list.add(15);
		list.add(8);
		list.add(5);
		list.add(12);
		list.add(7);
		
		System.out.println("before");
		System.out.println(list);
		
		for( int i=0;i<list.size();i++) {
			
			if(list.get(i)%2==0) {
				list.set(i, list.get(i)*list.get(i));
			}
		}
		System.out.println("----------------------------");
		System.out.println("After update");
		System.out.println(list);
	}

}
