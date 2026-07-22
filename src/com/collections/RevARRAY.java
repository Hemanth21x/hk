package com.collections;

import java.util.ArrayList;
import java.util.List;

public class RevARRAY {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(30);
		list.add(40);
		list.add(10);
		list.add(40);
		list.add(20);
		list.add(5);
		
		System.out.println("Array list : "+list);
		System.out.println("Reverse list:"+list.reversed());
		


	}

}
