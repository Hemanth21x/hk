package com.constactors;

 class Account {
	int accno;
	
	
	Account(int accno){
		this.accno=accno;
		System.out.println("Account number :"+accno);
		
	}
}
	 public class SavingsAccount  extends Account{
		double Balance;
		
		SavingsAccount(int accno,double Balance){
		super(accno);
		
		this.Balance=Balance;
		System.out.println("Balance : "+Balance);
	}

	public static void main(String[] args) {
		SavingsAccount ref= new SavingsAccount(988889,34567);
	
	}
		
	}


