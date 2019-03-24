package com.test.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorVsComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Employee> empTreeSet = new TreeSet<Employee>(new EmployeeComparator());

		Employee emp1 = new Employee(20, "Clark");
		Employee emp2 = new Employee(24, "Bernie");
		Employee emp3 = new Employee(3, "Alex");

		empTreeSet.add(emp1);
		empTreeSet.add(emp2);
		empTreeSet.add(emp3);


		for(Employee emp : empTreeSet)
			System.out.print(emp.name + " ");
	}

}

class Employee implements Comparable<Employee> {
	int id;
	String name;

	Employee(int id, String name){
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Employee emp) {
		System.out.println("inside comparable");
		return this.name.compareTo(emp.name);
	}

}

class EmployeeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		System.out.println("inside comparator");
		return emp2.id - emp1.id;
	}

}

