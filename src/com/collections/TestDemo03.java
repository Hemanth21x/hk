package com.collections;
import java.util.ArrayList;
import java.util.Collection;

public class TestDemo03 {


		public static void main (String [] args) {
			
			Collection <String> cs = new ArrayList <>();
			
//			cs.add("Apple");
//			cs.add("Orange");
//			cs.add("Banana");
//			cs.add("Watermelon");
//			cs.add("guava");
			
			System.out.println(cs.size());
			
			
				if(cs.contains("Apple")) {
					System.out.println("Yes Exists");
				}else {
					System.out.println("Not Exists");
					
				}
			
		}

	}
