package com.javafundamentals;

import java.math.BigInteger;
import java.math.BigDecimal;


public class Big {
	
	public static void main(String[] args) {
		
		System.out.println("*********Big interger***********");
	     BigInteger num1  = new BigInteger("576889996");
	     BigInteger num2  = new BigInteger("576889955");
	     
		
		BigInteger addint = num1.add(num2);
		BigInteger mulint = num1.multiply(num2); 
		BigInteger subint = num1.subtract(num2);
		
		
		System.out.println("Addtion of bigintger : " + addint);
		System.out.println("Substraction of bigintger : " +subint);
		System.out.println("Mul of bigintger : " +mulint);
		
		System.out.println("*********Big Decimal***********");
	     BigDecimal n1  = new  BigDecimal("57688977996");
	     BigDecimal n2 = new  BigDecimal("57688669955");
	     
		
	     BigDecimal Addint = n1.add(n2);
	     BigDecimal Mulint = n1.multiply(n2);
	     BigDecimal Subint = n1.subtract(n2);
		
		
		System.out.println("Addtion of BigDecimal : " + Addint);
		System.out.println("Substraction of BigDecimal : " +Subint);
		System.out.println("Mul of BigDecimal : " +Mulint);
		
		
		
		

	}

}
