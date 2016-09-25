package org.hometest.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by Ilia on 24.09.2016.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AddOperationTest.class,
        SubtractOperationTest.class,
        MultiplyOperationTest.class,
        DivisionOperationTest.class
})
public class TestSuite {

}
