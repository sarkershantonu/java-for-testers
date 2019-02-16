package org.automation.collection;

import org.automation.collection.mycollections.MyList;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestList {

    private List<?> myItems;

    @Before
    public void initTest(){
        myItems = new MyList<String>();
        myItems = new ArrayList<String>();
    }
    @Test
    public void testItemAdding(){

    }
    @Test
    public void testItemDelete(){

    }
    @Test
    public void testItemSwapping(){

    }
    @Test
    public void testItemDeleteInMiddle(){

    }
    @Test
    public void testPerformance_sorting(){

    }
    @Test
    public void testPerformance_searching(){

    }
}
