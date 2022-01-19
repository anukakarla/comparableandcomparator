package com.te.assignment2.comparable;

public class Employee  implements Comparable<Employee>{
	int id;
	String name;
	String address;
	public Employee(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public Employee() {
		
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}


	@Override
	public int compareTo(Employee o) {
		
		return this.id-o.id;
	}
	

}
