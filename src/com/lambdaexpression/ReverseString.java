package com.lambdaexpression;

import java.util.Scanner;
import java.util.function.Function;

public class ReverseString {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String :");
		String str =sc.nextLine();

		Function<String, String> rev = s -> new StringBuilder(s).reverse().toString();
		System.out.println(rev.apply(str));
		
		sc.close();
	}

}
