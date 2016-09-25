package org.hometest.test;

/**
 * Created by Ilia on 24.09.2016.
 */


import org.junit.Assert;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Step;

public class OperationTestSteps {

    @Step("Check adding operation result")
    public static void addTest(final String operand1, final String operand2, final String result) {
        final int expectedResult = Integer.parseInt(result);
        final int actualResult = Integer.parseInt(operand1) + Integer.parseInt(operand2);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Step("Check subtracting operation result")
    public static void subtractTest(final String operand1, final String operand2, final String result) {
        final int expectedResult = Integer.parseInt(result);
        final int actualResult = Integer.parseInt(operand1) - Integer.parseInt(operand2);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Step("Check multiplying operation result")
    public static void multiplyTest(final String operand1, final String operand2, final String result) {
        final int expectedResult = Integer.parseInt(result);
        final int actualResult = Integer.parseInt(operand1) * Integer.parseInt(operand2);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Step("Check dividing operation result")
    public static void divisionTest(final String operand1, final String operand2, final String result) {
        final double expectedResult = Double.parseDouble(result);
        try {
            final double actualResult = Double.parseDouble(operand1) / Double.parseDouble(operand2);
            Assert.assertEquals(expectedResult, actualResult, 0.0000001);
        } catch (ArithmeticException ex) {
            Assert.assertTrue(ex.getMessage(), false);
        }


    }
}
