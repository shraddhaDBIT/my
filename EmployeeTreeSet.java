package com.dac.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

import com.dac.collectinos.Employee;

public class EmployeeTreeSet {
	
	public static void main(String[] args) {
		
		NameComparator comparator = new NameComparator();
		TreeSet<Employee> employees = new TreeSet<>(comparator);
		
		Employee e1 = new Employee(1, "Atul", 10000);
		Employee e2 = new Employee(2, "Amid", 25000);
		Employee e3 = new Employee(3, "Madhuri", 20000);
		
		employees.add(e3);
		employees.add(e1);
		employees.add(e2);
		
		
		Iterator<Employee> iterator = employees.iterator();
		while( iterator.hasNext() ) {
			System.out.println(iterator.next());
		}
		
		
	}

}