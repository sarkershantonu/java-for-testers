package org.learning.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SSarker on 12/2/2018.
 */
public class Addition<T extends SuperTypeAny> {

    private T aT;

    public Addition(T aT) {
        this.aT = aT;
    }

    public T getaT() {
        return aT;
    }

    @Override
    public String toString() {
        return aT.toString();
    }

    public void setaT(T aT) {
        this.aT = aT;
    }
    public Number perform(T a){


        return aT.getVal()+a.getVal();

    }
}
