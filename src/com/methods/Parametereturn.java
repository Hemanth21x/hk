package com.methods;

public class Parametereturn {
	
	//method-->sum
	int add(int a,int b) {
		return a+b;
	}

	//method-->sub
	int sub(int a,int b) {
		return a-b;
	}
	
	//method-->mul
	int mul(int a,int b) {
			return a*b;
		}
	
	//method-->div
	double div(int a,int b) {
			return (double)a/b;
		}
	
	//method-->maxnumber
	 void maxnumber(int a,int b) {
		if(a>b) {
			System.out.println("A is greater : " +a );
		} else{
		System.out.println("B is greater : "+b);
	}
}
	 
	//method-->minimum of 3 numbers
	 int findmin(int a,int b,int c) {
		 int min = a; //assume a is min
		 if (b < min){
			 min = b;
		 }if(c < min){
			min=c; 
		 }
		 return min;
	 }
	 
	//method-->simple interest
	 double interst(double p,double r,double t) {
		 return p*r*t/100;
	 }
	 
	//method-->area of circle
	 double circle(double r) {
		 return 3.14*r*r;
	 }
	 
	  // Method-->check number type
	    void checkNumber(int num) {

	        if (num > 0) {
	            System.out.println(num + " is Positive");
	        } 
	        else if (num < 0) {
	            System.out.println(num + " is Negative");
	        } 
	        else {
	            System.out.println(num + " is Zero");
	        }
	    }
	    
	   //method--> convert Celsius to Fahrenheit
	    double convertToFahrenheit(double celsius) {
	        return (celsius * 9 / 5) + 32;
	    }
	    
	public static void main(String[] args) {
		
	Parametereturn obj1 = new Parametereturn(); //obj creation for sum
	int result = obj1.add(5,25);
    System.out.println("Sum is: " + result);
    
    Parametereturn obj2 = new Parametereturn(); //obj creation for sub
	int result1 = obj2.sub(40,25);
    System.out.println("Sub is: " + result1);
    
    Parametereturn obj3 = new Parametereturn(); //obj creation for mul
	int result2 = obj3.mul(10,25);
    System.out.println("mul is: " + result2);
    
    Parametereturn obj4 = new Parametereturn(); //obj creation for div
   	double result3 = obj4.div(100,25);
   	System.out.println("div is: " + result3);
   	
    Parametereturn obj5 = new Parametereturn(); //obj creation for max
    obj5.maxnumber(20, 30);
    obj5.maxnumber(40, 30);
    
    Parametereturn obj6 = new Parametereturn(); //obj creation for min
   	int result4 = obj6.findmin(10, 5, 26);
   	System.out.println("min: "+result4);
   	
    Parametereturn obj7 = new Parametereturn(); //obj creation for simple interest
 	double result5 = obj7.interst(100,25,8);
   	System.out.println("interest is: " + result5);
   	
   	Parametereturn obj8 = new Parametereturn(); //obj creation for simple interest
 	double result6 = obj8.circle(7);
   	System.out.println("Area of circle is: " + result6);
   	
   	Parametereturn obj9 = new Parametereturn();
   	obj9.checkNumber(-5);
   	
	Parametereturn obj10 = new Parametereturn();
	double result7 = obj10.convertToFahrenheit(30);
	System.out.println("temp : "+result7);
	
	
   	
	}

}
