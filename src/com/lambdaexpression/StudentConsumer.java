package com.lambdaexpression;
import java.util.function.Consumer;

class Student{
	String name;
	int age;
	
	Student(String name,int age){
		this.name=name;
		this.age=age;
	}
}

public class StudentConsumer {

	public static void main(String[] args) {
		
		Student s = new Student ("hemanth",76);
		
		Consumer<Student> details=st->System.out.println(st.name+" "+st.age);
		
		details.accept(s);
		
		

	}

}
