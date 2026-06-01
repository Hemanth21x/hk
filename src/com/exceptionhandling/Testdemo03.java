package com.exceptionhandling;

public class Testdemo03 {
	//Create a String "Hello". Use indexOf to find a character.
	//Then divide 10 by that result. 
	//What happens if the character doesn't exist? 
	//indexOf returns -1, so you get ArithmeticException — handle it.

	public static void main(String[] args) {
		
		String msg ="Hello";
		try {
			int result=msg.indexOf('z');
			int divisor=result+1;
			int value =10/divisor;
			System.out.println("Result : "+value);
		} catch (ArithmeticException e) {
			System.err.println("cannot divide by xero");
		}
	}

}
