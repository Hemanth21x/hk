package com.opps2;

class Student implements Cloneable {
	int sid;
	String sname;

	Address address;

	public Student(int sid, String sname, Address address) {
		this.sid = sid;
		this.sname = sname;
		this.address = address;

	}
	@Override
		protected Object clone() throws CloneNotSupportedException {
			return super.clone();
		}
}

class Address {
	String city;

	public Address(String city) {
		this.city = city;
	}
}

public class TestShallowCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Main method started");
		Address address =  new  Address("Hyderbad");
		Student s1 = new Student(101,"Hemanth",address);
		
		Student s2=(Student) s1.clone();
		
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address.city);
		System.out.println(s1);
		System.out.println("************S2*************");

		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s2.address.city);
		System.out.println("*****************************");
		
		s2.sid=103;
		System.out.println(s1.sid);
		System.out.println(s2.sid);
		System.out.println("******************************");

		s2.address.city="Banglore";
		System.out.println(s1.address.city);
		System.out.println(s2.address.city);
		
		System.out.println(s2);


	}

}

