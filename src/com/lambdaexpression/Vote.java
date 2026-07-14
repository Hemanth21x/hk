package com.lambdaexpression;

import java.util.function.Predicate;

public class Vote {
public static void main(String[] args) {
		
		Predicate<Integer> elgbile=vote->vote>18;
		System.out.println(elgbile.test(24));

	}

}
