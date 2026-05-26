package com.exceptionhandling;

public class TestDemo2 {

	public static void main(String[] args) {
		String s= "java";
		try {
			System.out.println(s.charAt(10));
		}catch(StringIndexOutOfBoundsException e){
			System.err.println("actual length is 4!invalid length!");
			
		}
	}

}
