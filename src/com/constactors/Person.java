package com.constactors;

public class Person {
	
	String name;
	int age;
	
	Person(String n,int a){
		name =n;
		age = a;
		
	}
	
	void display() {
		System.out.println("Name : "+name);
		System.out.println("age : "+age);
	}

	public static void main(String[] args) {
		
		Person obj = new Person("Hemanth",22);
		obj.display();
		
		Person obj2 = new Person("bajii",22);
		obj2.display();
	     
	}

}
