package LogicalStatements;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number : ");
	    int a = sc.nextInt();
	    
	    System.out.println("Enter the second number :");
	    int b = sc.nextInt();
	    
	    System.out.println("Enter your operator to perform");
	    String operator = sc.next();
	    
	    if(operator.equals("+")) {
	         int add = a+b;
	    	System.out.println("Addtion of  a+b : " +add );
	  }else if(operator.equals("*")){
		int mul =a*b; 
		System.out.println(" mul of a*b : "+mul);
	  } else if(operator.equals("-")){
		  int sub =a-b;
		  System.out.println(" sub of a-b : "+sub);  
	  } else if(operator.equals("%")) {
	      int div=a%b;
		  System.out.println(" div of a/b : "+div);
	  }else {
		 System.out.println("error!");
	  }
	    sc.close();
   }
}