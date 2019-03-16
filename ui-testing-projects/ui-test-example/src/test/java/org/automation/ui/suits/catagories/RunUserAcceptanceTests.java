package org.automation.ui.suits.catagories;

import org.automation.ui.core.groups.UserAcceptanceGeneral;
import org.automation.ui.tests.HomePageTests;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/***
 * runs all using UserAcceptanceGeneral
 */
@RunWith(Categories.class)
@Categories.IncludeCategory(UserAcceptanceGeneral.class)
@Suite.SuiteClasses({HomePageTests.class})
public class RunUserAcceptanceTests {
}
