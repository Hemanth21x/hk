package com.lambdaexpression;

import java.util.Scanner;
import java.util.function.Function;

//Write a lambda expression to extract the last character from a String using the Function interface.

public class LastCharcterStr {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String str =sc.nextLine();
		
		Function<String,Character> lastchar=s->s.charAt(s.length()-1);
		
		System.out.println("Last charcter "+lastchar.apply(str));
		sc.close();

	}

}
