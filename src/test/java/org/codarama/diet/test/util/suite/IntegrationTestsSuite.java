package org.codarama.diet.test.util.suite;

import org.codarama.diet.api.MinimizerTest;
import org.codarama.diet.api.RegistrarTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * A suite for slow integration tests.
 *
 * Created by ayld on 5/24/2015.
 */
@RunWith(Categories.class)
@Categories.IncludeCategory(IntegrationTest.class)
@Suite.SuiteClasses({
        MinimizerTest.class,
        RegistrarTest.class
})
public class IntegrationTestsSuite {
}