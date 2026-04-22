package com.constactors;

public class Overload {
	int id;
	String name;
	
	Overload(){
		id=0;
		name="def";
	}
	
	Overload(int i,String n){
		id = i;
        name = n;
	}
	
	 void display() {
	        System.out.println(id + " " + name);
	    }

	public static void main(String[] args) {
		Overload e1 = new Overload();
		Overload e2 = new Overload(101,"hemanth");
		e1.display();
        e2.display();

	}

}
