package org.automation.tests;

import org.automation.app.Calculator;
import org.automation.core.TestBase;
import org.automation.rules.SystemPrintRule;
import org.junit.*;
import org.junit.rules.TestWatcher;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class TestSub extends TestBase {


    @BeforeClass
    public static void commonSteps() throws IOException {
        System.out.println("Before Class from Test SUB ");
        TestBase.commonSteps();
    }
    @AfterClass
    public static void afterClass() throws IOException {
        System.out.println("After Class from TestSub");
    }

    @Before
    public void before() throws IOException {
        System.out.println("Before from Test SUB ");
    }
    @After
    public void after() throws IOException {
        System.out.println("After from TestSub");
    }

    @Rule
    public TestWatcher watcher = new SystemPrintRule();

    @Test(timeout = 20L)
    public void testfloatSub() {
        System.out.println("From Test");
        float result = aCalculator.sub(15.1f, 7.2f);
        assertEquals("float Subtraction failed", 7.9f, result, DELTA);
    }

    @Test(timeout = 20L)
    public void testdoubleSub() {
        double result = aCalculator.sub(15.1d, 7.2d);
        assertEquals("double Subtraction failed", 7.9d, result, DELTA);
    }

    @Test(timeout = 20L)
    public void testDoubleSub() {
        Double result = aCalculator.sub(15.1d, 7.2d);
        assertEquals("Double Subtraction failed", new Double(7.9), result, DELTA);
    }

    @Test(timeout = 20L)
    public void testIntSub() {
        int result = aCalculator.sub(15, 7);
        assertEquals("int Subtraction failed", 8, result);
    }

    @Test(timeout = 20L)
    public void testIntegerSub() {
        Integer result = aCalculator.sub(150, 710);
        assertEquals("float Subtraction failed", new Integer(-560), result);
    }
}
