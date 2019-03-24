package com.test.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student2> studs = new ArrayList<>();
		studs.add(new Student2(6,"neena"));
		studs.add(new Student2(1,"nimmy"));
		studs.add(new Student2(4,"cookie"));
		
		Collections.sort(studs);
		
		for(Student2 s : studs) {
			System.out.println(s);
		}

	}

}

class Student2 implements Comparable<Student2> {
	int id;
	String name;
	
	public Student2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student2 o) {
		if(this.id>o.id)
			return 1;
		return -1;
	}
}
