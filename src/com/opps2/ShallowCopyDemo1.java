package com.opps2;

class Employee implements Cloneable{
	int empid;
	String empname;
	int salary;
	
	public Employee(int empid,String empname,int salary) {
		this.empid=empid;
		this.empname=empname;
		this.salary=salary;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}

class Book{
	int bookid;
	String bookname;
	int price;
	
	public Book(int bookid,String bookname,int price) {
		this.bookid=bookid;
		this.bookname=bookname;
		this.price=price;
		
	}
}

class Mobile{
	String brand;
	String model;
	int price;
	
	public Mobile(String brand,String model,int price) {
		this.brand=brand;
		this.model=model;
		this.price=price;
		
	}
}

public class ShallowCopyDemo1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employee e1=new Employee(101,"Hemanth",50000);
		Employee e2=(Employee)e1.clone();
		
		System.out.println(e1.empid);
		System.out.println(e2.empid);
		System.out.println();
		
		Book b1 =new Book(1,"java",450);
		
		Mobile m1 = new Mobile("oneplus","nord2",35000);
		
		
		
		
		
		

	}

}
