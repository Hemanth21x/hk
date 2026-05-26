package LogicalStatements;
import java.util.Scanner;

public class Mul {
	
	static void ForInt(int n) {
		for(int i =1;i<=n;i++) {
			  System.out.println(n*i);
		}
		
	}
	public static void main() {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a number : ");
	int n = sc.nextInt();
	
	
	ForInt(n);

}
}
