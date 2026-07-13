package com.Multithreading;

class  BookMyShow{
	
	int total_availbletickets=10;
	
	synchronized void bookMyTicket(String name,int tickets) {
		
		if( total_availbletickets>=tickets) {
			System.out.println(tickets+"Tickets booked Successfully for : "+name);
			
			total_availbletickets=total_availbletickets-tickets;
			System.out.println("Remaining tickets left : "+total_availbletickets);
		}else {
			System.err.println("Sorry Buddy all tickets has been sold out ! "+name);
			System.err.println("Remaining tickets left : "+total_availbletickets);
		}
		
	}
	
}

class Customer extends Thread{
	
	BookMyShow bms;
	String customerName;
	int tickets;
	public Customer(BookMyShow bms, String customerName, int tickets) {
		super();
		this.bms = bms;
		this.customerName = customerName;
		this.tickets = tickets;
	}
	
	@Override
	public void run() {
		bms.bookMyTicket(customerName, tickets);
		
	}
	
	
}

public class BookMyShowDemo {
	 static BookMyShow bms= new BookMyShow();

	public static void main(String[] args) {
		
		Customer c1 = new Customer(bms,"Hemaanth", 5);
		c1.start();
		
		Customer c2 = new Customer(bms,"Rakesh", 3);
		c2.start();
		
		Customer c3 = new Customer(bms,"Gowtham", 4);
		c3.start();
		

	}

}
