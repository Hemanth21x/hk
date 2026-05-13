package LogicalStatements;

import java.util.Scanner;

public class Fabbocci {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a entry number : ");
			int a = sc.nextInt();
			
			System.out.println("Enter a exit number : ");
			int b = sc.nextInt();
			
		    int n1=0;
		    int n2=1;
		    
		    for(int i=2;i<=b;i++) {
		    	int n3=n1+n2;
		    	if(n3>b) {
		    		break;
		    	}
		    	if(n3>=a) {
		    		System.out.print(" "+n3);
		    	}
		    	n1=n2;
		    	n2=n3;
		    	
		    }
		    sc.close();

	}

}
