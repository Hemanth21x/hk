package com.lambdaexpression;

@FunctionalInterface
interface Cube{
	int cube(int n);
}

public class CubeOfNumber {

	public static void main(String[] args) {
		
		Cube c =n->n*n*n;
		System.out.println("Cube : "+c.cube(6));

	}

}
