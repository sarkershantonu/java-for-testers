package org.javalearning.abstraction;

public class MansGrandChild  extends Mans2ndChild{
	
	void dum() {
		super.drink();
	}
	
	MansGrandChild(){
		super("Sajib");
		System.out.println("I am MansGrandChild's Constractor ");
	}

}
