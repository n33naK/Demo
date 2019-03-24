package com.test.enums;

interface i {
	
}

enum Mobiles {
	//act as objects
	APPLE(100), SAMSUNG, HTC;
	
	//variables
	int price;
	
	//constructors
	Mobiles() {
		price = 80;
		System.out.println("constructor");	//gets called for every constant/object
	}
	
	//parameterized constructor
	Mobiles(int price) {
		this.price = price;
		System.out.println("parameterized constructor");
	}
	
	//methods
	public int getPrice() {
		return price;
	}
}

//this is possible
enum MobileChild implements i {
	
}

public class EnumDemo {

	public static void main(String[] args) {

		System.out.println(Mobiles.APPLE.getPrice());
		System.out.println(Mobiles.SAMSUNG.getPrice());
		
		//values method is given by the JVM, it's not part of the object class, enum class, etc. Try to ctrl+click and see .. 
		Mobiles m[] = Mobiles.values();
		for(Mobiles mobiles : m) {
			System.out.println(mobiles);
		}

	}

}
