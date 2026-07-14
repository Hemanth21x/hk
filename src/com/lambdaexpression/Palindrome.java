package com.lambdaexpression;

import java.util.Scanner;
import java.util.function.Predicate;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner  sc = new Scanner(System.in);
		
		System.out.println("Enter a String to check palindrome : ");
		String str=sc.nextLine();
		
		Predicate<String> palindrome=s->s.equals(new StringBuilder(s).reverse().toString());
		System.out.println(palindrome.test(str));
				
		
		sc.close();
		

	}

}
