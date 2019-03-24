package com.test.cloning;

public class CloningDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		A a1 = new A();
		a1.i = 3;
		a1.j = 6;
		
		A a2 = (A)a1.clone();
		
		a1.i = 5;
		
		System.out.println("a1 : " + a1);
		System.out.println("a2 : " + a2);
				
	}

}

class A implements Cloneable{
	int i;
	int j;
	@Override
	public String toString() {
		return "A [i=" + i + ", j=" + j + "]";
	}	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}