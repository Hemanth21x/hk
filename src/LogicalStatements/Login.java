package LogicalStatements;
import java.util.Scanner;

public class Login {
	String name;
	int pass;
	Scanner sc = new Scanner(System.in);
	void readPass() {
		System.out.println("Enter the password : ");
		pass = sc.nextInt();
		}
	void readUser() {
		System.out.println("Enter your UserName : ");
		name = sc.next();
	}

	public static void main(String[] args) {
		
		Login l = new Login();
		String  Username = "Hemanth";
		int password= 1000;
		l.readUser();
		
		
		if(Username.equals(l.name)){
			System.out.println("User name Matched");
			l.readPass();
			if(password==l.pass) {
				System.out.println("Password matched");
				System.out.println("Access granted !");
			}else
				System.out.println("Access denied ! ");
		}else {
			System.out.println("User name NotMatched");
			}
		
	}

}
