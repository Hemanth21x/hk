package com.lambdaexpression;

import java.util.Scanner;
import java.util.function.Function;

public class StrtoUpr {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String str = sc.nextLine();
		
		Function<String,String> upper= s->s.toUpperCase();
		
		System.out.println(upper.apply(str));
		sc.close();

	}

}
