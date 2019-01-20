package org.automation.tests;

import org.automation.app.Calculator;

import static org.junit.Assert.*;

import org.automation.core.TestBase;
import org.junit.*;

import java.io.IOException;

public class TestAdditions extends TestBase {
    @BeforeClass
    public static void commonSteps2() throws IOException {
        System.out.println("Before Class from TestAdditions ");
    }
    @BeforeClass
    public static void commonSteps3() throws IOException {
        System.out.println("Before Class from TestAdditions 3");
    }
    @AfterClass
    public static void afterClass2() throws IOException {
        System.out.println("After Class from TestAdditions");
    }

    @Before
    public void before2() throws IOException {
        System.out.println("Before from TestAdditions ");
    }
    @After
    public void after2() throws IOException {
        System.out.println("After from TestAdditions");
    }

    @Test(timeout = 20L)
    public void testStringAddition() {
        System.out.println("FROM TEST");
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
