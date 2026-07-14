package com.lambdaexpression;

import java.util.function.Predicate;

public class EvenNumber {

	public static void main(String[] args) {
      Predicate<Integer> even=n->n%2==0;
      
      System.out.println(even.test(44));
      
	}

}
