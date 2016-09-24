package org.hometest.test;

/**
 * Created by Ilia on 24.09.2016.
 */

import org.hometest.test.OperationTestSteps;
import org.hometest.test.DataLoader;
import org.junit.Test;
import static junit.framework.Assert.*;
import ru.yandex.qatools.allure.annotations.*;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import java.util.List;
import java.util.Arrays;

@Title("Operation test suite")
@RunWith(Parameterized.class)
public class OperationTest {
    private String operand1;
    private String operand2;
    private String operation;
    private String result;

    public OperationTest(String operand1, String operand2, String operation, String result) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operation = operation;
        this.result = result;
    }

    @Parameters(name = "{0} {2} {1} = {3}")
    public static List<String[]> data() {
        final List<String[]> data = DataLoader.loadData(".\\src\\main\\resources\\datafile");
        return data;
    }

    @Test
    public void Test() {
        if (operation.equals("+")) {
            OperationTestSteps.addTest(operand1, operand2, result);

        } else if (operation.equals("-")) {
            OperationTestSteps.subtractTest(operand1, operand2, result);

        } else if (operation.equals("*")) {
            OperationTestSteps.multiplyTest(operand1, operand2, result);

        } else if (operation.equals("/")) {
            OperationTestSteps.divisionTest(operand1, operand2, result);

        } else {
            System.out.print("Not supported operation type");
        }


    }
}
