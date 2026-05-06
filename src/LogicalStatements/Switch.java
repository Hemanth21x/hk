package LogicalStatements;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the day : ");
		int a = sc.nextInt();
		
		switch(a) {
		case 1 ->System.err.println("Monday");
		case 2 ->System.err.println("Tuesday");
		case 3 ->System.err.println("Wednesday");
		case 4 ->System.err.println("Thursday");
		case 5 ->System.err.println("Friday");
		case 6 ->System.err.println("saturday");
		case 7->System.err.println("Sunday");
		}
		sc.close();
}
}
