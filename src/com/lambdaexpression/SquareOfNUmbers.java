package com.lambdaexpression;

@FunctionalInterface
interface Square{
	int square(int n);
}
public class SquareOfNUmbers {

	public static void main(String[] args) {
		
		Square s =n->n*n;
		System.out.println("Square ="+s.square(6));

	}

}
