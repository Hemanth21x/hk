package com.methods;


public class Integer {
	// method to print integer
	 void printinteger(int num) {
		 System.out.println("given integer  : " +num);
	 }
	 
	 //method to return 100 
	 int getNumber(){  //method return an integer
		 return 100;  //send value back to caller
	 }
	 
	 //method to sum of 2 numbers
	 void printsum(int a,int b) {
		 int sum =  a+ b;
		System.out.println("sum of two numbers : "+sum);
	 }

	 //method-->square of numbers
	 int getSquare(int num) {
		 return num*num;
	 }
	 
	 //method-->even or odd
	 void checkEvOD(int num) {
		 if(num % 2 == 0) {
		 System.out.println("it is a even number : " +num);
	 }else {
		 System.out.println("it is a odd number : "+num);
	 }
	 }
	 
	// Method to print numbers from 1 to 10
	 void printnumbers() {
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}
	 }
	 
	//method-->cube of numbers
	 int getCube(int num) {
		 return num*num*num;
	 }
	 
	//method-->print char
	 void printchar(char ch) {
		 for(char i = 0;i<=5;i++) {
			 System.out.println(""+ch);
		 }
	 }
	public static void main(String[] args) {
		Integer obj = new Integer(); //obj creation for integer
		obj.printinteger(24);
		
		Integer obj1=new Integer();  //obj creation for return value
		int result = obj1.getNumber(); // calling method storing result
		System.out.println("Return value is : "+result);
		
		Integer obj2=new Integer(); 
		obj2.printsum(10,30); //call method with values
		
		Integer obj3 =new Integer(); //obj creation for square of 2 numbers
		int result1 = obj3.getSquare(6);
		System.out.println("Return value is : "+result1);
		
		Integer obj4 =new Integer(); //obj creation for even or odd
		obj4.checkEvOD(20);
		obj4.checkEvOD(7);
		
		Integer obj5 =new Integer(); //obj creation for print numbers
		obj5.printnumbers();
		
		Integer obj6 =new Integer(); //obj creation for cube of numbers
		int result2=obj6.getCube(4);
		System.out.println("Cube of two numbers : " +result2);
		
		Integer obj7 =new Integer(); //obj creation for char
		obj7.printchar('H');
	}

}
