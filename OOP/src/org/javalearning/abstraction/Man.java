package org.javalearning.abstraction;

public class Man {
	
	String name;
	String age;

	void eat() {
		System.out.println("I am eating ");
	}

	void drink() {
		System.out.println("I am drinking ");
	}
	void study() {
		System.out.println("I am reading "+(2+2));
	}
	
	
	
	void work() {
		System.out.println("I am working ");
	}
	void work(String how) {
		System.out.println("I am working "+how);
	}
	//
	void work(Integer me) {
		System.out.println("I am working "+me);
	}
	void work(Double me) {
		System.out.println("I am working "+me);
	}
	void work(Long me) {
		System.out.println("I am working "+me);
	}
	void work(Float me) {
		System.out.println("I am working "+me);
		
	}
	//
	/*void work(Number me) {
		System.out.println("I am working "+me);
	}*/
	
	<T extends Number > void work(T me) {
		System.out.println("I am working "+me);
	}
	
	//generic + 
	
	void work(Float me, String boss) {
		System.out.println("I am working "+me);
	}
	void work(String me, Float boss) {
		System.out.println("I am working "+me);
	}
}
