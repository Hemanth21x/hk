package LogicalStatements;
import java.util.Scanner;

public class Recurrsion {
	
	static int EvenOdd(int n) {
		if(n==0) {
			System.out.println("even munber");
			return 0;
		}
		if(n==1) {
		System.out.println("odd number");
		return 1;
		}
	return EvenOdd(n-2);
	}
	
	static int isRec(int n){
		if(n==1) {
			return 1;
		}
		return n*isRec(n-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a entry number : ");
		int n = sc.nextInt();
		
	     EvenOdd(n);
 	     int rec=isRec(n);
	     System.out.println("Factorial value of given number : "+rec);
		
	    

	}

}
