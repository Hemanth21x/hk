package LogicalStatements;
import java.util.Scanner;
public class Table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("which table");
		int n =sc.nextInt();
		
		System.out.println("upto ");
		int n1 =sc.nextInt();
		
		for(int i =1;i<=n1;i++) {
			
			System.out.println(n+" x "+i+" = "+(i*n));
			
		}
		
	}

}
