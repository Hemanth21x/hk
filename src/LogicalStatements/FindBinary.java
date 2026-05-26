package LogicalStatements;

import java.util.Scanner;

public class FindBinary {
	static  void findbinary( int n) {
		int r=0;
		String bn="";
		while(n>0) {
			r=n%2;
			n=n/2;
			bn =r+bn;
		}
		System.out.println("Binary number for given digit "+bn);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to convert binary ");
		int n =sc.nextInt();
		
		findbinary(n);
		sc.close();
	}

}
