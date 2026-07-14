package com.lambdaexpression;

//Add Two Numbers using BiFunction

import java.util.Scanner;
import java.util.function.BiFunction;

public class AddTwoNumbers {

	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a:");
		int a = sc.nextInt();
		
		System.out.println("Enter b:");
		int b = sc.nextInt();
		
		BiFunction<Integer,Integer,Integer> multiply=(x,y)->x*y;
		System.out.println("Multiplication = " + multiply.apply(a, b));

		BiFunction<Integer,Integer,Integer> add=(x,y)->x+y;
		System.out.println("add = " + add.apply(a, b));
        sc.close();
		
		

	}

}
