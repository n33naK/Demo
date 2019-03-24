package com.test.annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Inherited
@Documented
//target and retention are called as meta annotations
@Target(ElementType.TYPE) //on what level we'll be using these annotations. like class level, method level, etc. "type" is for class or interface - MANDATORY
@Retention(RetentionPolicy.RUNTIME) //to specify till what point you want this annotation.  - MANDATORY
@interface Smartphone {
	String os();
	int version() default 6;
}

@Smartphone(os = "Android") //specified value will override default values
class NokiaASeries {
	String model;
	int size;
	public NokiaASeries(String model, int size) {
		this.model = model;
		this.size = size;
	}
}

public class AnnotationDemo {
	public static void main(String[] args) {
		NokiaASeries obj = new NokiaASeries("fire", 5);
		System.out.println(obj.model);
		
		// need to use reflection api to get the values of Smartphone
		Class c = obj.getClass();
		Annotation an = c.getAnnotation(Smartphone.class);
		Smartphone s = (Smartphone)an;
		System.out.println(s.os());
	}
}
