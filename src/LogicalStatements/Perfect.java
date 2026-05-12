package LogicalStatements;
import java.util.Scanner;

public class Perfect {
	
	static boolean isperfect(int n) {
		boolean status=false;
		int sum=0;

		for( int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum=sum+i;
			}if(sum==n){
				status=true;
			}
		}
	   return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
        int n = sc.nextInt();
        
        boolean flag = isperfect(n);
        
        if(flag) {
        	    System.out.println("its a perfect number!");
        }else {
        	    System.out.println("not a perfect number!");
        }
	}

}
