package LogicalStatements;
import java.util.Scanner;

public class DigCount {
	static int digitsum(int n) {
		int count=0;
		
		while(n>0){
			n=n/10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number ");
		int n =sc.nextInt();
		
		int count= digitsum(n);
		System.out.println("count of given number "+count);
		
		
	sc.close();	
	}

}
