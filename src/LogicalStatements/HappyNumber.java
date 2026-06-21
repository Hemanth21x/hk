package LogicalStatements;

import java.util.Scanner;

public class HappyNumber {

	static boolean happies(int n) {
		boolean flag = false;
		int r = 0;
		int sum = 0;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			sum = sum + (r * r);
		}
		if (sum == 1) {
			return true;
		} else if (sum >= 0 && sum < 10) {
			return false;
		}
		return happies(sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		boolean flag = happies(n);
		if (flag) {
			System.out.println("Its is a happy number! ");
		} else {
			System.out.println("Its not a happy number! ");
		}
		sc.close();
	}

}
