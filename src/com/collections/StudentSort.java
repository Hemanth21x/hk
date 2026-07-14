package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
	int id;
	String Name;
	int age;
	
	Student(int id,String Name,int age){
		this.id=id;
		this.Name=Name;
		this.age=age;
		
	}
}

public class StudentSort {

	public static void main(String[] args) {
		
		ArrayList<Student>  list=new ArrayList<>();
		list.add(new Student(101,"Hemanth",23));
		list.add(new Student(102,"Rakesh",22));
		list.add(new Student(103,"baji",21));
		
		Collections.sort(list,new Comparator<Student>(){
			   @Override
			   public int compare(Student s1,Student s2) {
				   return Integer.compare(s1.age, s2.age);
			   }
			});
		
		 for (Student s : list) {
	            System.out.println(s.id + " " + s.Name + " " + s.age);
	        }


	}

}
