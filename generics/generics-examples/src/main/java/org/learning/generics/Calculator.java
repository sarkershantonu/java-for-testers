package org.learning.generics;

/**
 * Created by SSarker on 12/2/2018.
 */
public class Calculator {
    public int add(int a,int b)
    {
        return a+b;
    }
    public Integer add(Integer a,Integer b)
    {
        return a+b;
    }
    public MyInt add(MyInt a,MyInt b)
    {
        return new MyInt( a.getVal()+b.getVal());
    }

    public <RONY extends SuperTypeAny> Integer add(RONY a, RONY b){
        //T = subtype of SuperTypeAny- arafat

        return a.getVal()+b.getVal();

    }
    public  <T extends SuperTypeAny & MyAnyType2>  Integer add2(T a, T b){
//T = subtype of SuperTypeAny & MyAnyType2 - arafat

        return null;

    }
    public <T extends SuperTypeAny , MyAnyType2>Integer add3(T a, T b){
        return a.getVal()+b.getVal();

    }


/*
    public MyTypeANY add(MyTypeANY a,MyTypeANY b)
    {
        return new MyTypeANY( a.getVal()+b.getVal());
    }
    public FaizanAny add(FaizanAny a,FaizanAny b)
    {
        return new FaizanAny( a.getVal()+b.getVal());
    }

*/

    /*public <T extends SuperTypeAny> T add(T a, T b){

        Object o = new Object();
        o=(a.getVal()+b.getVal());

        return ;

    }*/
}
