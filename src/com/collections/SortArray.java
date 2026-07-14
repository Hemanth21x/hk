package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortArray {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Hemanth");
		list.add("Baji");
		list.add("Rakesh");
		list.add("Visesh");
		
		Collections.sort(list,new Comparator<String>(){
	   @Override
	   public int compare(String a,String b) {
		   return a.compareTo(b);
	   }
	});
		
		System.out.println(list);

	}

}
