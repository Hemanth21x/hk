package com.lambdaexpression;

import java.util.Scanner;
import java.util.function.Function;

public class SquareRoot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        Function<Integer,Double> n=x->Math.sqrt(x);
        
        System.out.println("Square root of "+num+" is "+n.apply(num ));
        
        sc.close();


	}

}
