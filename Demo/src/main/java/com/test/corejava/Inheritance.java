package com.test.corejava;

public class Inheritance implements One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance i = new Inheritance();
		i.show();
	}

}

interface One {
	default void show() {
		System.out.println("one");
	}
}

interface Two {
	default void show() {
		System.out.println("two");
	}
}