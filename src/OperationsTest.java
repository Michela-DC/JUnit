//Exercise: JUnit
//        Define a class where you have 2 static methods:
//        subtraction that takes minuend and subtrahend as int params and returns the difference
//        multiplication that takes multiplier and multiplicand as int params and returns the product
//        using JUnit, write and execute at least 2 tests for each method, giving some information to the user regarding each test

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OperationsTest {

    @Test
    public void subtractionPositiveTest() {
        int subtractionResult = Operations.subtraction(37, 18);
        Assertions.assertEquals(19, subtractionResult);
    }

    @Test
    public void subtractionNegativeTest() {
        int subtractionResult = Operations.subtraction(7, 35);
        Assertions.assertEquals(44, subtractionResult);
    }

    @Test
    public void multiplicationPositiveTest() {
        int multiplicationResult = Operations.multiplication(4, 8);
        Assertions.assertEquals(32, multiplicationResult);
    }

    @Test
    public void multiplicationNegativeTest() {
        int multiplicationResult = Operations.multiplication(12, 27);
        Assertions.assertEquals(36, multiplicationResult);
    }
}