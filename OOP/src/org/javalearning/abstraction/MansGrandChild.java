package org.javalearning.abstraction;

public class MansGrandChild  extends Mans2ndChild{
	
	void dum() {
		super.drink();
	}
	
	MansGrandChild(){
		
		System.out.println("I am MansGrandChild's Constractor ");
	}

}
