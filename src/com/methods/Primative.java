package com.methods;

public class Primative {
	
	int getInt() {
		return 10;
	}
	
	double getDouble() {
		return 22.8;
	}
	
	float getFloat() {
		return 10.8f;
	}
	
	char getChar(){
		return 'A';
	}
	
	boolean getBoolean() {
		return true;
	}

	void show(){
		System.out.println("The integer : "+getInt());
		System.out.println("The double : "+getDouble());
		System.out.println("The float : "+getFloat());
		System.out.println("The char : "+getChar());
		System.out.println("The boolean"+getBoolean());
		
	}
	public static void main(String[] args) {
		Primative obj=new Primative();
		obj.show();
		
	}

}
