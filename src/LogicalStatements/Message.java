package LogicalStatements;

import java.util.Scanner;
public class Message {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		
		if(a%3==0 && a%5==0){
			System.out.println("Fizzbuzz");
		}else if(a%5==0) {
			System.out.println("buzz");
		}else if(a%3==0) {
			System.out.println("Fizz");
		}
		else {
			System.out.println("Entered no is : "+a);
		}
		sc.close();
	}

}
