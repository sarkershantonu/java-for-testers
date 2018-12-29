package org.learning.generics;

/**
 * Created by SSarker on 12/2/2018.
 */
public class App {
    public static void main(String[] args) {


        MyTypeANY a = new MyTypeANY(5);

        MyTypeANY b = new MyTypeANY(2);
       // System.out.println(new Calculator().add(a,b));

        System.out.println(new Addition<MyTypeANY>(a).perform(b));



    }
}
