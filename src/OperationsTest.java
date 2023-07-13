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
        Operations operation = new Operations(37, 18);
        Assertions.assertEquals(19, operation.subtraction());
    }

    @Test
    public void subtractionNegativeTest() {
        Operations operation = new Operations(82, 30);
        Assertions.assertEquals(44, operation.subtraction());
    }

    @Test
    public void multiplicationPositiveTest() {
        Operations operation = new Operations(12, 3);
        Assertions.assertEquals(36, operation.multiplication());
    }

    @Test
    public void multiplicationNegativeTest() {
        Operations operation = new Operations(34, 8);
        Assertions.assertEquals(32, operation.multiplication());
    }
}