package com.javafundamentals;

public class Bank {
	static int acc_no;
	String name;
	long balance;
	{
		acc_no = acc_no+1;
	}
	void display(){
		System.out.println("Account Number : " +acc_no);
		System.out.println("Account Holder Name : " +name);	
		System.out.println("Account Balance : " +balance);	
	}
	
	public static void main (String[] args) {
		
	Bank user1 = new Bank();
	user1.name = "Hemanth";
	user1.balance = 20000;
	user1.display();
	
	Bank user2 = new Bank();
	user2.name = "Baji";
	user2.balance = 40000;
	user2.display();
	}
}
