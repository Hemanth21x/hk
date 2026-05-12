package LogicalStatements;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a entry number : ");
		int n = sc.nextInt();
		
		System.out.println("Enter a exit number : ");
		int n1 = sc.nextInt();
		
		for(int i=n;i>=n1;i--) {
			System.out.println(i);
		}
	}

}
