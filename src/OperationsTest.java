//Exercise: JUnit
//        Define a class where you have 2 static methods:
//        subtraction that takes minuend and subtrahend as int params and returns the difference
//        multiplication that takes multiplier and multiplicand as int params and returns the product
//        using JUnit, write and execute at least 2 tests for each method, giving some information to the user regarding each test

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OperationsTest {

    @Test
    public void subtractionFirstTest() {
        int subtractionResult = Operations.subtraction(37, 18);
        assertEquals(19, subtractionResult);
    }

    @Test
    public void subtractionSecondTest() {
        int subtractionResult = Operations.subtraction(74, 30);
        assertEquals(44, subtractionResult);
    }

    @Test
    public void multiplicationFirstTest() {
        int multiplicationResult = Operations.multiplication(4, 8);
        assertEquals(32, multiplicationResult);
    }

    @Test
    public void multiplicationSecondTest() {
        int multiplicationResult = Operations.multiplication(12, 3);
        assertEquals(36, multiplicationResult);
    }
}