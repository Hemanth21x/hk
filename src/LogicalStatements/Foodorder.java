package LogicalStatements;
import java.util.Scanner;

public class Foodorder {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("******Our menu*********");
		System.out.println("Pizza");
		System.out.println("Burger");
		System.out.println("Drinks");
		
		System.out.println("Enter your Food item :");
		String food = sc.next().toLowerCase();
		
		switch(food){
		case "pizza"->{
			System.out.println("******Pizza Menu********");
			System.out.println("Veg pizza");
			System.out.println("Chicken pizza");
			
			
			System.out.println("Enter your food item :");
			String item = sc.next().toLowerCase();
			switch(item) {
			case "chicken"-> System.out.println("Price of Chicken pizza is 240 ");   
			case "veg"-> System.out.println("Price of Veg pizza is 150 ");
			}
			
		}
		case "burger"->{
			System.out.println("********Burger Menu********");
			System.out.println("Veg Burger");
			System.out.println("Chicken Burger");
			
			
			System.out.println("Enter your food item : ");
			String item = sc.next().toLowerCase();
			switch(item) {
			case "chicken"-> System.out.println("Price of Chicken burger is 150");   
			case "veg"-> System.out.println("Price of Veg burger is 100 ");
			}
		}
		case "drinks"->{
			System.out.println("********Drinks Menu**********");
			System.out.println("Coke");
			System.out.println("Banana juice");
			
			
			System.out.println("Enter your food item : ");
			String item = sc.next().toLowerCase();
			switch(item) {
			case "coke"-> System.out.println("Price of coke is 50");   
			case "banana"-> System.out.println("Price of Banana juice is 50");
		}
	  } default->System.out.println("Not available ");
    }
			
   }
  }

