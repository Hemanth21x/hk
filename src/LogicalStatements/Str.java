package LogicalStatements;
 import java.util.Scanner;
public class Str {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a charcter : ");
		char ch= sc.next().charAt(0);
		
		
		if(ch>='a' && ch<='z') {
		  System.out.println("it is between a to z");
		}
		   else if(ch>='A' && ch<='Z') {
		        System.out.println("it is between A to Z");
		}
		   else if(ch>='0' && ch<='9') {
			System.out.println("it is between 0 to 9");
		}else {
			 System.out.println("it is a Special character");
		}
		
	}
}
