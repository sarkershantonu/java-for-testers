package org.javalearning.abstraction;

public class Application {

	public static void main(String[] args) {
		Man tushar = new Man();
		tushar.name="Goutom Chakrabarty";
		
		tushar.eat();
		tushar.drink();
		tushar.study();
		tushar.work();
		tushar.drink();
		tushar.eat();
		tushar.drink();	
		System.out.println(tushar.name);
		
		Man mamun = new Man() ;
		mamun.eat();
		mamun.drink();
		mamun.study();
		mamun.eat();
		mamun.drink();
		mamun.study();
		mamun.drink();
		mamun.eat();
		mamun.drink();		
	}

}
