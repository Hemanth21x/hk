package com.lambdaexpression;

	
@FunctionalInterface
interface Message{
	void print();
}

public class HelloWorld {

    public static void main(String[] args) {

Message msg =()->System.out.println("Hello World!");

msg.print();


}
}