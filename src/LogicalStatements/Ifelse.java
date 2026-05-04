package LogicalStatements;

import java.util.Scanner;

public class Ifelse {
	
	public static void main(String[] args ) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("**********************");
		System.out.println("Enter the age : ");
		int n=sc.nextInt();
		
		if(n>18) {
			System.out.println("Your are eligible for voting");
		} else { 
		System.out.println("Your are  not eligible for voting");
	}
		System.out.println("**********************");
}
}
