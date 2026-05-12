package LogicalStatements;
import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a entry number : ");
		int n = sc.nextInt();
		
		System.out.println("Enter a exit number : ");
		int n1 = sc.nextInt();
		
		int evenCount=0;
		int oddCount=0;
		
		for(int i =n;i<=n1;i++) {
			if(i%2==0) {
				evenCount+=1;
				System.out.println("even numbers are : "+i);
			}else {
				oddCount+=1;
				System.out.println("odd numbers are : " +i);
				
			}
		}
		System.out.println("even count : "+evenCount);
		System.out.println("odd count : "+oddCount);
		
	}

}
