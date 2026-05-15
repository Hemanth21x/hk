package LogicalStatements;
import java.util.Scanner;

public class Armstrong {
	static boolean isArm(int n) {
		boolean flag = false;
		
		int count=0;
		int original = n;
        int sum = 0;
        // Count digits 
        int temp = n;

        while(temp > 0) {
            count++;
            temp = temp / 10;
        }

        // Armstrong logic
        temp = n;

        while(temp > 0) {

            int digit = temp % 10;

            int power = 1;

            for(int i = 1; i <= count; i++) {
                power = power * digit;
            }

            sum = sum + power;

            temp = temp / 10;
        }

        // Check
        if(sum == original) {
            flag = true;
        }

        return flag;
    }
		

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		
		boolean flag =isArm(n);
		if(flag) {
		System.out.println("Armstrong Number !");
		}else {
			System.out.println("not an Armstrong Number!");
		}
		
		
		sc.close();
	}

}
