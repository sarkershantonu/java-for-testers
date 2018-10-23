package org.javalearning.abstraction;

public abstract class Man {

	protected String name;
	private String name2;

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	String age;

	// protected abstract void smoking();//virtual class ++

	Man(String name_at_birth) {
		// this();
		this.name = name_at_birth;
		System.out.println("I am Man's Constractor with Name init");
	}

	Man(int age) {
		this.age = String.valueOf(age);
	}
	
	Man() {
		System.out.println("I am Man's Constractor ");
	}

	void eat() {
		System.out.println("I am eating ");
	}

	protected void drink() {
		System.out.println("I am drinking ");
	}

	void study() {
		System.out.println("I am reading " + (2 + 2));
	}

	void work(Integer x, int y) {
		System.out.println("I am working ");
	}
	void work() {
		System.out.println("I am working ");
	}
	

	void work(String how) {
		System.out.println("I am working " + how);
	}

	//
	void work(Integer me) {
		System.out.println("I am working " + me);
	}

	void work(Double me) {
		System.out.println("I am working " + me);
	}

	void work(Long me) {
		System.out.println("I am working " + me);
	}
	void work(Float me, Float me2) {} 
	void work(Float me) {
		System.out.println("I am working " + me);
	}
	//
	/*
	 * void work(Number me) { System.out.println("I am working "+me); }
	 */

	<T extends Number> void work(T me) {
		System.out.println("I am working " + me);
	}

	// generic +

	void work(Float me, String boss) {
		System.out.println("I am working " + me);
	}

	void work(String me, Float boss) {
		System.out.println("I am working " + me);
	}
}
