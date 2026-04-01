package com.javaintro;
;

public class Student {
	int s_id ;
	String s_name;
	String email ;
	String s_address ;
    static int obj=0;
	static int count;
	Student(){
		count++;
	}
	
	public static void main (String[] args) {
//		System.out.println("--------------Student 1 info-----------");
		Student s1 = new Student();
	s1.s_id = 001;
		s1.s_name = "Baji";
		s1.email = "baji@gmai.com";
		s1.s_address = "Karempudi";
		System.out.println("Student Roll No : " + s1.s_id);
		System.out.println("Student Name : " + s1.s_name);
		System.out.println("Student email : " + s1.email);
		System.out.println("Student Address : "+ s1.s_address);
		System.out.println();
		obj=obj+1;
		
		
		System.out.println("--------------Student 2 info-----------");
		Student s2 = new Student();
		s2.s_id = 002;
		s2.s_name = "Hemanth";
	s2.email = "Hemanth@gmai.com";
		s2.s_address = "Vijayawada";
		System.out.println("Student Roll No : " + s2.s_id);
	System.out.println("Student Name : " + s2.s_name);
		System.out.println("Student email : " + s2.email);
		System.out.println("Student Address : "+ s2.s_address);
		System.out.println();
		obj=obj+1;
		
		
		System.out.println("--------------Student 3 info-----------");
		Student s3 = new Student();
		
		
	}

}