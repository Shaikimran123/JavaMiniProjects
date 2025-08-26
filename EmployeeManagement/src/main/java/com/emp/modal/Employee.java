package com.emp.modal;

public class Employee {
	
	private int empid;
	private String name;
	private int age;
	private String phonenumber;
	private String email;
	private double salary;
	
	public Employee() {
	}

	public Employee(int empid, String name, int age, String phonenumber, String email, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.age = age;
		this.phonenumber = phonenumber;
		this.email = email;
		this.salary = salary;
	}

	public Employee(String name, int age, String phonenumber, String email, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.phonenumber = phonenumber;
		this.email = email;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public String getEmail() {
		return email;
	}

	public double getSalary() {
		return salary;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", age=" + age + ", phonenumber=" + phonenumber
				+ ", email=" + email + ", salary=" + salary + "]";
	}

	




}
