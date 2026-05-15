
import java.util.Scanner;

public class ReverseW {
	static int reverseNo(int n) {
		int sum=0;
		int r=0;
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum*10+r;
		}
		
		return sum;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number for reverse order :  ");
		int n =sc.nextInt();
		
		int rev=reverseNo(n);
		System.out.println("Reverse number of given number is : "+rev);

	}

}
