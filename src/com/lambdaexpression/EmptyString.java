package com.lambdaexpression;

import java.util.function.Predicate;

public class EmptyString {

	public static void main(String[] args) {
		
		Predicate<String>empty=str->str.isEmpty();
		System.out.println(empty.test(""));

	}

}
