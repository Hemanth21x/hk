package com.constactors;

public class Car {
	
	String brand;
	double cost;
	
	  Car(){
		 brand = "lg";
		 cost= 18000;
	}
	
	void display() {
		System.out.println("The brand name: "+brand);
		System.out.println("Cost of the  item: "+cost);
		
	}
	

	public static void main(String[] args) {
		Car obj = new Car();
		obj.display();

	}

}
