package LogicalStatements;
import java.util.Scanner;

public class DigitSum {
	static int digitsum(int n){
		int sum=0;
		int r=0;
		while(n>0) {
			r = n%10;
			n = n/10;
			sum = sum+r;
		}
		
		
	return sum;	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a numner for Digitsum :  ");
		int n =sc.nextInt();
		
		int sum =digitsum(n);
		System.out.println("Sum of given number is : "+sum);
		sc.close();
	}

}
