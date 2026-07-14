package com.lambdaexpression;

import java.util.Scanner;
import java.util.function.Function;

public class SquareofNumbers2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		int x=sc.nextInt();
		

		Function<Integer,Integer> square=n->n*n;
		
		System.out.println("Square root of " +x +" is "  +square.apply(x));
		sc.close();
	}

}
