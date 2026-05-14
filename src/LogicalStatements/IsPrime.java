package LogicalStatements;

import java.util.Scanner;

public class IsPrime {

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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the range : ");
		int n = sc.nextInt();
		
		for(int i=0;i<=n;i++) {
			if(isprime(i)) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
