package org.javalearning.abstraction;

public class Mans2ndChild extends Man{
	void dummyMethod() {
		super.eat();
		this.eat();
		super.drink();
		this.drink();
		super.name="asdas";
		super.setName2("asasd");
		
	}
	
	Mans2ndChild(){
		System.out.println("I am Mans2ndChild's Constractor ");
	}
	
	@Override
	protected void drink() {
		System.out.println("I am drinking from child 2");
	}
	
}
