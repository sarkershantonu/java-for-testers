package org.automation.collection;

import org.junit.Before;

import java.util.Stack;

public class TestStack {
    private Stack items;
    @Before
    public void initTest(){
        items = new Stack();
    }

    //push
    public void testAdd(){
        // item added
        // item count
    }
    //pop
    public void testRemove(){
        // able to remove
        //removed item will be latest added one
        // count
    }
    public void removeFirstItemLast(){
        // able to remove
        //Last removed item will be 1st added one
    }

}
