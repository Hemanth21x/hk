package com.lambdaexpression;

import java.util.function.Consumer;

public class PrintName {

	public static void main(String[] args) {
		
		Consumer<String>print=name->System.out.println(name);
		print.accept("Hemanth");


	}

}
