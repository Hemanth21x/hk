package com.array;
import java.util.Scanner;

public class Prime {
	static boolean isprime(int n) {
		boolean flag=true;
		if(n==0||n==1) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				flag = false;
				break;
			}
		}
	return flag; 
}
	static void checkdigit( int n ) {
		int temp=n;
		int div=10;
		while(temp>0) {
			int temp1=n;
			while(temp1>=div/10) {
			
				int r=temp1%div;
				if(isprime(r)) {
					System.out.println(r);
				}
				temp1=temp1/10;
			}
			div*=10;
			temp/=10;
			
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		
		checkdigit(n);
		
		
	sc.close();
	}

}
