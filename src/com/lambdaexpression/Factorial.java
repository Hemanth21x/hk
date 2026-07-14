package com.lambdaexpression;

import java.util.function.Consumer;

public class Factorial {

	public static void main(String[] args) {
		
		Consumer<Integer> fact = n->{
			
			int f =1;
			
			for(int i=1;i<=n;i++)
				f*=i;
			 System.out.println(f);
			
		};
		fact.accept(5);

	}

}
