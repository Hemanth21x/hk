package com.collections;

import java.util.ArrayList;
import java.util.List;

public class DispalyTopStudents {
	public static void main(String[] args) {

	
	List<String> list=new ArrayList<>();
	
	list.add("ram");
	list.add("Hemanth");
	list.add("Kiran");
	list.add("rakesh");
	list.add("visesh");
	list.add("Gowtham");
	list.add("Hemanth");
	
	 for (int i = 0; i < list.size(); i++) {

         for (int j = i + 1; j < list.size(); j++) {

             if (list.get(i).equals(list.get(j))) {

                 list.set(j, "baji");

             }

         }

     }
	System.out.println(list);
	
	System.out.println("ListStudents");
	System.out.println(list);
	System.out.println("---------------------------------");
	System.out.println("SubListStudents");
	List<String> topStudents=list.subList(1,4 );
	System.out.println(topStudents);
	}
}
