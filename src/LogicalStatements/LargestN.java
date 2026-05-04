package LogicalStatements;

import java.util.Scanner;

public class LargestN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a  number A : ");
		int a = sc.nextInt();

		System.out.println("enter a  number B : ");
		int b = sc.nextInt();

		System.out.println("enter a  number C : ");
		int c = sc.nextInt();

		if (a == b && b == c) {
			System.out.println("Given numbers are same");
			return;
		} else {
			if (a > b) {
				if (a > c)
					System.out.println("A is Greater !");
				else
					System.out.println("C is Greater !");
			} else {
				if (b > c)
					System.out.println("B is Greater !");
				else
					System.out.println("C is Greater !");
			}
		}
	}

}
