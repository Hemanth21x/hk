package com.lambdaexpression;

import java.util.Scanner;
import java.util.function.Function;

public class StringLength {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String :");
		String str =sc.nextLine();
		
		Function<String, Integer> length = s -> s.length();
		
		System.out.println(length.apply(str));
		sc.close();

	}

}
