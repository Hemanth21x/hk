package com.opps2;

class EmpSal {

	private String name;
	private double salary;

	public EmpSal(double salary) {

		if (salary > 0) {
			this.salary = salary;
		} else {
			System.out.println("Invalid salary!");
			this.salary = 0;
		}
	}

	public void setSalary(double salary) {

		if (salary > 0) {
			this.salary = salary;
		} else {
			System.out.println("Salary must be greater than 0");
		}
	}

	public double getSalary() {
		return salary;
	}

	public void setName(String name) {

		if (name != null && !name.trim().isEmpty()) {
			this.name = name;
		} else {
			System.out.println("Name cannot be empty");
		}
	}

	public String getName() {
		return name;
	}
}

public class EmployeeSalary {

	public static void main(String[] args) {

		EmpSal emp = new EmpSal(10000);

		emp.setName("Hemanth");

		System.out.println("Employee Name : " + emp.getName());
		System.out.println("Employee Salary : " + emp.getSalary());

		emp.setSalary(15000);

		System.out.println("Updated Salary : " + emp.getSalary());
	}
}