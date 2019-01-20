package org.learning.generics;

/**
 * Created by SSarker on 12/2/2018.
 */
public class FaizanAny extends SuperTypeAny {
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
    public FaizanAny(){}
    public FaizanAny(Integer val) {
        this.val = val;
    }
    public FaizanAny getVal2(){
        return new FaizanAny(val);
    }
}
