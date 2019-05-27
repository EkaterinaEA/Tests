package ru.krasnova;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void Test1() {
        Calculator calculator = new Calculator();
        int sum = calculator.evaluate("1+2+3");
        assertEquals(6, sum);
    }

    @Test
    public void Test2() {
        Calculator calculator = new Calculator();
        int sum = calculator.evaluate("3+3+3");
        assertEquals(9, sum);
    }
}
