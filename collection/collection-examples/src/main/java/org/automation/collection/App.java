package org.automation.collection;

import org.automation.collection.mycollections.MyList;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<Integer> myItems = new Vector<>();
        myItems.add(50);
        myItems.add(100);
        /* myItems.poll();

        System.out.println(myItems.toString());*/

       printAllData(myItems);
    }

    public static <T> void printAllData(List<T> items){
        int i =0;
        for (T a : items){
            System.out.println( items.get(i++));
        }
    }
}
