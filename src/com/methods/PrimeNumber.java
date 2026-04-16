package com.methods;
import java.util.Scanner;

public class PrimeNumber {
	
	//prime or not
	boolean isPrime(int n) {
		if(n <= 1) {
			return false; //handle small numbers eg:0,-5....
		}
		for(int i =2; i <= n/2; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	//method to print prime up to n
	void printprime(int limit) {
		 System.out.println("Prime numbers up to " + limit + " are:");
		 
		 for (int i = 2; i <= limit; i++) {
		 if(isPrime(i)) {
			 System.out.print(i + " "); 
		 }
	   }
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		PrimeNumber obj = new PrimeNumber();
		
		//caling
		if(obj.isPrime(num)) {
			System.out.println(num + "is a prime number");
		}else {
			System.out.println(num + "is  not a prime number");
		}
		
		System.out.println("enter limit: ");
		int n =sc.nextInt();
	    PrimeNumber obj2 = new PrimeNumber();
		
		obj2.printprime(n);
		sc.close();
	}

}
