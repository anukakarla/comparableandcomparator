package com.te.assignment2.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeTest {
	

	//@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(39,"Anu","blr"));
		list.add(new Employee(34,"MAlli","chennai"));
		list.add(new Employee(33,"Aisu","delhi"));
		System.out.println("==before sorting ==");
		for (Object employee : list) {
			System.out.println(employee);
			
		}
		System.out.println("==After Sorting==");
		Collections.sort(list);
		for (Employee emp : list) {
			System.out.println(emp);
			
		}
		
		
	}
}