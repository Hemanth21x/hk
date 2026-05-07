package assignments;
import java.util.Scanner;

public class RestMenu {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int totalbill =0;
		String items ="";
		
		
		int choice;
		
			do {
				int quanity=0;
			System.out.println("******Our menu*********");                                //our menu section
			System.out.println("1.Pizza");
			System.out.println("2.Burger");
			System.out.println("3.Drinks");
			
			System.out.println("Enter your Food item :");
			int food = sc.nextInt();

		
				switch(food){                                                            //switch case for menu section
				
				case 1->{
					System.out.println("******Pizza Menu********");                      //switch case sub section
					System.out.println("1.Veg pizza");
					System.out.println("2.Chicken pizza");
					
					
					System.out.println("Enter your food item :");
					String item = sc.next().toLowerCase();
					
					
					switch(item) {
					case "1"-> { 
						System.out.println("Enter the Quantity : ");					//nested-switch case for sub section    case1
					    quanity= sc.nextInt();
						System.out.println("Price of Chicken pizza is 240 ");            //case
						totalbill = totalbill + 240;
						totalbill=totalbill*quanity;
						items=items+"\nChicken pizza =240"+"no of Quantity"+quanity;
					}
					case "2"-> {
						System.out.println("Enter the Quantity : ");					//nested-switch case for sub section    case1
					    quanity= sc.nextInt();
						System.out.println("Price of Veg pizza is 150 ");
					    totalbill=totalbill+150;
					    totalbill=totalbill*quanity;
					    items=items+"\nVeg pizza=150"+"no of Quantity"+quanity;
					}default->System.out.println("Invalid Item");
				}
			}
				
				case  2->{                                                              
					System.out.println("********Burger Menu********");
					System.out.println("1.Veg Burger");
					System.out.println("2.Chicken Burger");
					
					
					System.out.println("Enter your food item : ");
					String item = sc.next().toLowerCase();
					switch(item) {                                                       //nested-switch case for sub section    case2
					case "1"-> {
						System.out.println("Enter the Quantity : ");					//nested-switch case for sub section    case1
					    quanity= sc.nextInt();
						System.out.println("Price of Chicken burger is 150"); 
						totalbill=totalbill+150;
						totalbill=totalbill*quanity;
						items=items+"\nVeg burger=150"+"no of Quantity"+quanity;
					}
					case "2"-> {
						System.out.println("Enter the Quantity : ");					//nested-switch case for sub section    case1
					    quanity= sc.nextInt();
						System.out.println("Price of Veg burger is 100 ");
						totalbill=totalbill+100;
						totalbill=totalbill*quanity;
						items=items+"\nChicken burger=100"+"no of Quantity"+quanity;
					}default->System.out.println("Invalid Item");
				}
			}
				
				case 3->{
					System.out.println("********Drinks Menu**********");
					System.out.println("1.Coke");
					System.out.println("2.Banana juice");
					
					
					System.out.println("Enter your food item : ");
					String item = sc.next().toLowerCase();
					switch(item) {                                                          //nested-switch case for sub section    case2
					case "1"->{
						System.out.println("Enter the Quantity : ");					//nested-switch case for sub section    case1
					    quanity= sc.nextInt();
						System.out.println("Price of coke is 50");
						totalbill=totalbill+50;
						totalbill=totalbill*quanity;
						items=items+"\nCoke=50"+"no of Quantity"+quanity;
					}
					case "2"->{ 
						System.out.println("Enter the Quantity : ");					//nested-switch case for sub section    case1
					    quanity= sc.nextInt();
						System.out.println("Price of Banana juice is 50");
						totalbill=totalbill+50;
						totalbill=totalbill*quanity;
						items=items+"\nJuice=50"+"  Quantity"+quanity;
					}default->System.out.println("Invalid Item");
				}
			}
				default->System.out.println("Invalid Item");
		}
		
		System.err.println("\nDo you want anything else?");
		System.out.println("1. Yes");
		System.out.println("2. No");

		choice = sc.nextInt();
	
			} while (choice == 1);
	System.out.println("\n============= FINAL BILL ===================");
	System.out.println(items);
	
    System.out.println("\n-----------------------------------------------");
	System.out.println("\nTotal Amount = " + totalbill);
	System.out.println("================================================");

	System.out.println("\nThank You Visit Again ^_^!");

	sc.close();
		
	 }
  }

