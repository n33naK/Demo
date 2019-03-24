package com.test.enums;

enum Mobile {
	APPLE, SAMSUNG, HTC;
}

class Mobile2 {
	static final Mobile2 APPLE = new Mobile2();
	static final Mobile2 SAMSUNG = new Mobile2();
	static final Mobile2 HTC = new Mobile2();
}

// Mobile 2 is the internal working or compiler conversion of how Mobile works. 

public class EnumBTS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
