package com.constactors;

public class Where {
	
	Where(){
        this(10); // calling parameterized constructor
        System.out.println("No-arg constructor");
    }

    // Parameterized constructor
	Where(int x) {
        System.out.println("Parameterized constructor: " + x);
    }

	
	public static void main(String[] args) {
		Where obj = new Where();
	}

}
