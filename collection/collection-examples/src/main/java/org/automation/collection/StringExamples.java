package org.automation.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
      // System.out.println('a'+ " is in " + "JavaTraining".lastIndexOf(97)+"th place");
      /*  System.out.println("PRINT="+
                " StartWithSpace".trim());*/
    /*  String myEx =String.join("-","Shantonu","Daily","Training");
       *//* myEx = "JoiningExample".join(
                "-","Shantonu","Daily","Training"
        );*//*
        List<String> items = new ArrayList<>();
        items = Arrays.asList(new String[]{"Shantonu", "Daily","Training"});
        String myEx2="Mamun".join("_",items);*/
        String[] items= "abc1de2f3gh".split("\\d",0);

        String[] items2= "abc1de2f3gh".split("[a-z]+");

        for(String item:items2){
            System.out.println(item);
        }


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
