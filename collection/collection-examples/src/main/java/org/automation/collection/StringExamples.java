package org.automation.collection;

import java.util.Objects;

public class StringExamples {
    private int x;
    public static String aStatic = new String("Static Item");



    @Override
    public int hashCode() {
        return x;
    }

    public static void main(String[] args) {
/*
        int i=1;
        while(true){
            stringOperation();
            aStatic =++i+" : New Val";
        }*/

       /* System.out.println("Without Case >>"+isEqual("JavA", "java"));
        System.out.println("WithCase>>"+isEqualWIthCase("JavA", "java"));
      */
       System.out.println('a'+ " is in " + "JavaTraining".lastIndexOf(97)+"th place");
    }

    public static void stringOperation() {
        String aString = new String("Java Training");
        String kString = new String("java training");
        final String bString = "Java Training";
        String cString = "Training";


    }

    private static boolean isEqual(String a, String b) {
        return a.equalsIgnoreCase(b);
    }
    private static boolean isEqualWIthCase(String a, String b) {
        return a.equals(b);
    }

}
