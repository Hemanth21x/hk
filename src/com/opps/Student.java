package com.opps;

public class Student {  
	private int sid;
	private String sname;
	private long phno;
	
	void setSid(int sid) {
	this.sid =sid;	
	}
	
	void setSname(String sname) {
	this.sname=sname;	
	}
	
	void setPhno( long phno) {
	this.phno=phno;
	}
	
	
	int getSid(){
	return sid;	
	}
	
	String getSname(){
	 return sname;
	}
	
	long getPhno(){
	return phno;	
	}
}
