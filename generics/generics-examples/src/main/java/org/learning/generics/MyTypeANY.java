package org.learning.generics;

/**
 * Created by SSarker on 12/2/2018.
 */
public class MyTypeANY extends SuperTypeAny{
    private Integer val;

    @Override
    public String toString() {
        return val.toString();
    }

    public Integer getVal() {
        return val;
    }

    public void setVal(Integer val) {
        this.val = val;
    }

    @Override
    public MyTypeANY getVal2() {
        return new MyTypeANY(val) ;
    }

    public MyTypeANY(){}
    public MyTypeANY(Integer val) {
        this.val = val;
    }
}
