package org.automation.suits;


import org.automation.tests.TestAdditions;
import org.automation.tests.TestSub;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestAdditions.class, TestSub.class
})
public class RegressionTestsSuite {
}
