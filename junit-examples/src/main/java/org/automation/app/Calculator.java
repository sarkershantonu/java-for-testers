package org.automation.app;

public class Calculator {
    public Double add(Double a, Double b){
        return new Double(a.doubleValue()+b.doubleValue());
    }
    public Integer add(Integer a, Integer b){
        return new Integer(a.intValue()+b.intValue());
    }
    public String add(String a, String b){
        return new String(a+b);
    }
    public int add(int a, int b){
        return a+b;
    }
    public double add(double a, double b){
        return a+b;
    }
    public float add(float a, float b){
        return a+b;
    }
    public boolean or(boolean a, boolean b){
        return a||b;
    }



    public Double sub(Double a, Double b){
        return new Double(a.doubleValue()-b.doubleValue());
    }
    public Integer sub(Integer a, Integer b){
        return new Integer(a.intValue()-b.intValue());
    }

    public int sub(int a, int b){
        return a-b;
    }
    public double sub(double a, double b){
        return a-b;
    }
    public float sub(float a, float b){
        return a-b;
    }


}
