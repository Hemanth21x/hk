package com.javafundamentals;

public class Typecasting {
	
	double d1 = 230.3;
		int i1 =(int)d1;
		float f1=(float)d1;
		long l1=(long)d1;

	public static void main(String[] args) {
		
		Typecasting cas= new Typecasting();
		
		System.out.println("double : "+cas.d1);
		System.out.println("int : "+cas.i1);
		System.out.println("float : "+cas.f1);
		System.out.println("long : "+cas.l1);


	}

}
