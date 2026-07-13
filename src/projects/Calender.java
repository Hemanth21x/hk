package projects;
import java.util.Scanner;

public class Calender {
	static boolean isLeapyear(int year) {
		retrun (year%400==0||year%4==0&&year%100!=0);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter month!: ");
		int month=sc.nextInt();
		
		System.out.println("Enter year! : ");
		int year=sc.nextInt();
		
		int[] days= {31,28,31,30,31,30,
				31,31,30,31,30,31};
		
		
		
	}

}
