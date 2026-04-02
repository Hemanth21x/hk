package com.javafundamentals;

public class Method12 {
	int id;
	String name;
	char gender;
	int standard;
	
	void method1(){
		method2();
		System.out.println("id : " +id);
		System.out.println("name : " +name);	
		System.out.println("Gender : "+gender);	
		System.out.println("Class : " +standard);
}
	void method2() {
		 id= 12;
		 name="Hemanth";
		 gender= 'M';
         standard =12;
         
		}

	public static void main(String[] args) {
		Method12 stu = new Method12();
         stu.method1();
	}

}
