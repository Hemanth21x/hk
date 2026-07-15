package com.collections;

import java.util.ArrayList;
import java.util.List;

public class StudentMarks {

	public static void main(String[] args) {
		
		List<Integer> marks = new ArrayList<>();
		
		marks.add(30);
		marks.add(60);
		marks.add(90);
		marks.add(35);
		marks.add(50);
		
		System.out.println("Before using set");
		System.out.println(marks);
		
		for(int i =0;i<marks.size();i++) {
			if(marks.get(i)<35) {
				marks.set(i,35);
			}
		}
		System.out.println("--------------------------");
		System.out.println("After using set");
		System.out.println(marks);
	}

}
