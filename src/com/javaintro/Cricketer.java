package com.javaintro;

public class Cricketer {

	    // static variable initialization
	  static  int country_id;
	   static  String country_name;

	    // instance variable initialization
	 int jersy_no;
	 String name;

	    public static void main(String[] args) {

	        System.out.println("---------------------Main method Start here!------------------");
	        System.out.println("---------------Object 1 info-------------");

	         
	         Cricketer a = new Cricketer();
	         
	         a.jersy_no=7;
	   	     a.name ="dhoni";
	   	    
	   	    System.out.println("Country_id : " + country_id);
	        System.out.println("Country_name : " + country_name);
	        System.out.println("Jersey_no : " + a.jersy_no);
	        System.out.println("Name : " + a.name);
	        
	        System.out.println("---------------Object 2 info-------------");
	        
	        country_id=91;
	         country_name="india";
	       
	         Cricketer b = new Cricketer();
	         
	       
	   	    
	   	    System.out.println("Country_id : " + country_id);
	        System.out.println("Country_name : " + country_name);
	        System.out.println("Jersey_no : " + b.jersy_no);
	        System.out.println("Name : " + b.name);
	        
	        
	        System.out.println("---------------------Main method End here!------------------");
	    }
	}