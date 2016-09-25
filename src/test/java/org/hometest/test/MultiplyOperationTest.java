package org.hometest.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.yandex.qatools.allure.annotations.Features;

import java.util.List;

/**
 * Created by Ilia on 24.09.2016.
 */

@RunWith(Parameterized.class)
public class MultiplyOperationTest extends OperationTest{

    public MultiplyOperationTest(String operand1, String operand2, String operation, String result) {
        super(operand1, operand2, operation, result);
    }

    @Parameterized.Parameters(name = "{0} {2} {1} = {3}")
    public static List<String[]> data() {
        return DataLoader.loadData(".\\src\\main\\resources\\datafile", "*");
    }

    @Features("Multiplying")
    @Test
    public void TestMultiplying() {
        OperationTestSteps.multiplyTest(operand1, operand2, result);

    }
}