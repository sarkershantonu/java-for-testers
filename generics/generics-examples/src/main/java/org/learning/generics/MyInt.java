package org.learning.generics;

/**
 * Created by SSarker on 12/2/2018.
 */
public class MyInt {
    private Integer val;

    public MyInt(Integer val) {
        this.val = val;
    }

    public Integer getVal() {
        return val;
    }

    public void setVal(Integer val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val.toString();
    }
}
