package com.test.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {

	public static void main(String[] args) {
		
		ArrayList<Student> studs = new ArrayList<>();
		studs.add(new Student(2,"neena"));
		studs.add(new Student(5,"nimmy"));
		studs.add(new Student(1,"cookie"));
		
		Comparator<Student> com = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				if(o1.id>o2.id)
					return 1;
				return -1;
			}			
		};
		
		Collections.sort(studs,com);
		
		for(Student s : studs) {
			System.out.println(s);
		}

	}

}

class Student {
	int id;
	String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}
