package LogicalStatements;
import java.util.Scanner;
public class NthPrime {

			static boolean isprime(int n) {
				boolean flag=true;
				
				for(int i=2;i<n;i++) {
					if(n%i==0) {
						flag = false;
						break;
					}
				}
			return flag; 
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter nth prime no :");
			int n = sc.nextInt();
			
			int count=0;
			int num =2;
			
			while(count<n) {
				if(isprime(num)) {
				count++;
				}
				num++;
				if(count==n) {
					System.out.println("Nth prime numner is : "+(num-1));
				}
				}
			}
		}
		