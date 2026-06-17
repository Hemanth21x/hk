package com.opps2;

public class Person {
	
	String name;
	int age;
	
	public void dispaly() {
		System.out.println("Name : "+this.name);
		System.out.println("age: "+this.age);
		
	}

}
class Students extends Person{
	int rollno;
	public void studentinfo() {
		System.out.println("Rollno : "+this.rollno);
	}
	public static void main(String [] args) {
		 
		Students s1=new Students();
		s1.name="hemanth";
		s1.rollno=101;
		s1.age=22;
		
		s1.dispaly();
		s1.studentinfo();
	
	}
	
}

