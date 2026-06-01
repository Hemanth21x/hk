package com.exceptionhandling;

public class Testdemo04 {

	public static void main(String[] args) {
		
		try {
			String str = null;
			System.out.println(str.length());
			int result = 10 / 0;
            System.out.println(result);

		}catch(NullPointerException e){
			System.err.println("NullPointerException handled");
			
		}
		catch (ArithmeticException e) {

            System.err.println("ArithmeticException handled");
        }
		catch (Exception e) {

	            System.out.println("General Exception handled");
	        }

	        System.out.println("Program continues...");

	}

}
