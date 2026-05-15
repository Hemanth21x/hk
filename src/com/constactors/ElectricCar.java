package com.constactors;


class Vehicle{
	String brand;
 
	Vehicle(){
		
	}
    Vehicle(String brand){
    	this.Brand=brand;
    	System.out.println("Brand name: "+brand);
		
	}

}

class Car{
	long price;
	
	Car(){
		
	}
   Car(long price,String brand){
	   super(brand);
	   this.price=price;
	  
	   
		
	}
}


public class ElectricCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
