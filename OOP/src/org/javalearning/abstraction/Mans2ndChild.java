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
	Mans2ndChild(String a, String b, int c){
		
	}
	Mans2ndChild(){
		super(25,"name");
		System.out.println("I am Mans2ndChild's Constractor ");
	}
	Mans2ndChild(String aName){		
		this();
		System.out.println("I am Mans2ndChild's Constractor ");
	}
	
	@Override
	protected void drink() {
		System.out.println("I am drinking from child 2");
	}
	
}
