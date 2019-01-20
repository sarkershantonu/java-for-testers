package org.automation.collection.maps;

import java.util.EnumMap;

public class EnumMapExample {
    public static void main(String[] args) {
        EnumMap<DAYS,String> items = new EnumMap<DAYS, String>(DAYS.class);

    }
    public enum DAYS {
        SAT,SUN,MON,TUE,WED,THUR,FRI;
    }
}
