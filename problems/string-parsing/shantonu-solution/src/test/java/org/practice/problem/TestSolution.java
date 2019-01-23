package org.practice.problem;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {
    private StringProcessing processor;
    private String word = "A pattern P is called a subsequence of Text T if the pattern preserves the relative ordering of characters within the text T and it might not appear in a continuous fashion";
    @Before
    public void init(){
        processor = new StringProcessing();
    }
    @Test
    public void testWordCount(){
        processor.setParagraph(word);//mamun
        Assert.assertEquals("Word Count", 32,processor.getWordCount());
    }
    @Test
    public void testVerbCount(){
        processor.setParagraph(word);//tasnia
        Assert.assertEquals("Verb Count",5,processor.getVerbCount());
    }
    @Test
    public void testAuxVerbCount(){
        processor.setParagraph(word);//tushar
        Assert.assertEquals("Verb Count",2,processor.getAuxVerbCount());
    }
    @Test
    public void testTheCount(){
        processor.setParagraph(word);//sajib
        Assert.assertEquals("Verb Count",3,processor.getTheCount());
    }
}
