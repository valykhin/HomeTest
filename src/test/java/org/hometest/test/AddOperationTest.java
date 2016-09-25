package org.hometest.test;

/**
 * Created by Ilia on 24.09.2016.
 */

import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import ru.yandex.qatools.allure.annotations.Features;

import java.util.List;


@RunWith(Parameterized.class)
public class AddOperationTest extends OperationTest{

    public AddOperationTest(String operand1, String operand2, String operation, String result) {
        super(operand1, operand2, operation, result);
    }

    @Parameters(name = "{0} {2} {1} = {3}")
    public static List<String[]> data() {
        System.out.print((DataLoader.loadData(".\\src\\main\\resources\\datafile", "+")).size());
        return DataLoader.loadData(".\\src\\main\\resources\\datafile", "+");
    }

    @Features("Adding")
    @Test
    public void TestAdding() {

        OperationTestSteps.addTest(operand1, operand2, result);
    }
}
