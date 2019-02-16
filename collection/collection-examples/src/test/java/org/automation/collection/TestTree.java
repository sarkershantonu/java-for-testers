package org.automation.collection;
public class TestTree {
    public void addItem(){
    //item added
    //count
    }
    public void removeItem(){
        //item remove
        //count -
    }
    public void addLeaf(){
        //item added
        //a node/leaf will be a parent
        //child item become leaf
    }
    public void removeLeaf(){
        //item removed
        //a parent item will become child/leaf
        //a child will be deleted
    }
    public void addNode(){
        //adding an element in middle
    }
    public void removeNode(){}
    public void addRoot(){}
    public void removeRoot(){}
    public void addBranchAsTree(){
        //items added
        //the added node/child will be root of the branch
        //the whole branch will be added with all child
    }
    public void removeBranchAsTree(){
        //items removed
        //removed node's parent will be leaf/child
        //the whole branch will be deleted with all child
    }

}
