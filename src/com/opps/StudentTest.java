package com.opps;

public class StudentTest {

	public static void main(String[] args) {
		Student obj = new Student();
		
		obj.setSid(101);
		obj.setSname("Hemanth");
		obj.setPhno(9398329975l);
		
		System.out.println(obj.getSid());
		System.out.println(obj.getSname());
		System.out.println(obj.getPhno());
	
		}

}
