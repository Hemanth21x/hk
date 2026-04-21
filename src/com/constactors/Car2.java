package com.constactors;
import java.util.Scanner;

public class Car2 {
	
	String brand;
	double price;
	
	Car2(){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the brand name: ");
		brand = sc.nextLine();
		System.out.println("price of the product: ");
		price =sc.nextDouble();
		
	}
	 void display() {
		 System.out.println("The brand name: "+brand);
		System.out.println("Cost of the  item: "+price);
		 
	 }
	
	
	public static void main(String[] args) {
		Car2 obj = new Car2();
		
		obj.display();
		

    }
}
