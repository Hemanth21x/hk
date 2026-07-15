package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class UsingRemove {

	public static void main(String[] args) {

		List<String> list= new ArrayList<>();
		
		list.add("java");
		list.add("Python");
		list.add("sql");
		list.add("Python");
		list.add("mysql");
	    
		System.out.println("before remove()");
		System.out.println(list);
		
		//Using for loop to do remove()
//		for(int i=0;i<list.size();i++) {
//			if(list.get(i)=="Python") {
//				list.remove(i);
//		}
//			
//	}
		
		Iterator<String> itr =list.iterator();
		
		while(itr.hasNext()) {
			
			String lang =itr.next();
			if(lang.equals("Python")) {
				itr.remove();
			}
		}
		
		System.out.println("---------------------------------");
		System.out.println("After using Remove()");
		System.out.println(list);
		
		ListIterator<String> li =list.listIterator(list.size());
		
		System.out.println("------------------------------------");
	  System.out.println("Using ListIterator finding previous");
		
		while(li.hasPrevious()){ 
			System.out.println(li.previous());
		}
 }
}
