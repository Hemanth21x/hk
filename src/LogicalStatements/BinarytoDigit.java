package LogicalStatements;

import java.util.Scanner;

public class BinarytoDigit {
	static void finddecimal(int n) {
		int r=0;
		int dn=0;
		int count=0;
		while(n>0) {
			r=n%10;
			n=n/10;
			count++;
			if(r==1) {
				dn=(int) (dn+Math.pow(2, count-1));
			}

		}
		System.out.println("Decimal number is : "+dn);
	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter binary number to convert Decimal :  ");
		int n =sc.nextInt();
		
		finddecimal(n);
	
		
	sc.close();
	}

}
