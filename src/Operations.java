//Exercise: JUnit
//        Define a class where you have 2 static methods:
//        subtraction that takes minuend and subtrahend as int params and returns the difference
//        multiplication that takes multiplier and multiplicand as int params and returns the product
//        using JUnit, write and execute at least 2 tests for each method, giving some information to the user regarding each test

public class Operations {

    private int number1;
    private int number2;

    public Operations(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int subtraction() {
        return number1 - number2;
    }

    public int multiplication() {
        return number1 * number2;
    }
}
