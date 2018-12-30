package org.automation.tests;

import org.automation.app.Calculator;

import static org.junit.Assert.*;

import org.automation.core.TestBase;
import org.junit.Before;
import org.junit.Test;

public class TestAdditions extends TestBase {


    @Test(timeout = 20L)
    public void testStringAddition() {
        String result = aCalculator.add("Java", "Training");
        assertEquals("String Addition failed", "JavaTraining", result);
    }

    @Test(timeout = 20L)
    public void testIntAddition() {

        int result = aCalculator.add(5, 7);
        assertEquals("Int Addition failed", 12, result);
    }

    @Test(timeout = 20L)
    public void testIntegerAddition() {

        Integer result = aCalculator.add(5, 7);
        assertEquals("Integer Addition failed", new Integer(12), result);
    }

    @Test(timeout = 20L)
    public void testfloatAddition() {

        float result = aCalculator.add(5.1f, 7.2f);
        assertEquals("float Addition failed", 12.3, result, DELTA);
    }

    @Test(timeout = 20L)
    public void testdoubleAddition() {

        double result = aCalculator.add(5.1d, 7.2d);
        assertEquals("double Addition failed", 12.3, result, DELTA);
    }

    @Test(timeout = 20L)
    public void testDoubleAddition() {

        Double result = aCalculator.add(5.1d, 7.2d);
        assertEquals("Double Addition failed", new Double(12.3), result, DELTA);
    }
    @Test(timeout = 20L)
    public void testBooleanAddition() {
        boolean result = aCalculator.or(true, false);
        assertEquals("Boolean OR failed", true ,result);
    }
}
