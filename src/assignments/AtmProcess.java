package assignments;
import java.util.Scanner;

public class AtmProcess {
	static void  pinvalid(int n) {
		int pin =2020;
		int balance=0;
		if(pin==n) {
			int choice;
			
			do {
  
			System.out.println("Tranasaction to Procedd");
			System.out.println(" 1.Deposit ");
			System.out.println(" 2.Withdrawal ");
			System.out.println(" 3.Balance Amount ");
			System.out.println(" 4.Mini Statement ");
			System.out.println(" 5.Exit ");
			
			Scanner sc = new Scanner(System.in);
			System.out.println(" Choose transaction ");
			int trans=sc.nextInt();
			
			
			switch(trans) {
			case 1->{
				System.out.println(" Deposit ");
			
				System.out.println(" Enter the amount ");
				int d = sc.nextInt();
				
				balance = balance+d;
				System.out.println("Total balance:"+d);
			
			}
				
			case 2->{
				System.out.println(" Withdrawal ");
				
				System.out.println(" Enter the amount ");
				int w = sc.nextInt();
				
				if(w>=balance) {
					balance=balance-w;
					System.out.println(" Avail Balance is : "+balance);
				}else {
					System.out.println("insufficent funds");
				}
				
				
			}
			case 3->{
				int currentbalance= balance;
				System.out.println("Balance check");
				System.out.println("Balance"+currentbalance);
			}
			
			case 4->{
				long accountnumber=1337494903;
				String acc_name="Hemanth";
				System.out.println("Mini Statement");
				System.out.println("Account number : "+accountnumber);
				System.out.println("acc_holder name : "+acc_name);
				System.out.println("Balance : "+balance);
				}
			
			 case 5 -> {
                 System.out.println("Thank You for Using ATM");
             }

             default -> {
                 System.out.println("Invalid Transaction");
             }
			}
            System.out.println("\nDo you want to continue?");
            System.out.println("1.Yes");
            System.out.println("2.No");

            choice = sc.nextInt();

            } while (choice == 1);
		}else{
			System.out.println(" Invalid pin & Enter again! ");
		}
  }
	
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		
		System.out.println("ATM PIN ");
		int p = sc.nextInt();
		
		pinvalid(p);
		
		
	sc.close();	
	}

}
