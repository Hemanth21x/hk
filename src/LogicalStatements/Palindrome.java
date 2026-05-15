package LogicalStatements;
import java.util.Scanner;

public class Palindrome {
	static boolean ispalin(int n){
		boolean flag=false;
		int sum=0;
		int r=0;
		int temp=n;
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum*10+r;
		}
	    if(sum==temp) {
	    	return true;
	    }
		return flag;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number : ");
		int n = sc.nextInt();
		
		boolean flag =ispalin(n);
		if(flag) {
			System.out.println("its a palindrome number!");
		}else {
			System.out.println("its not a palindrome number!");
		}
		sc.close();
	}
}
