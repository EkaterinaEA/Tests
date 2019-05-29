package ru.krasnova;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class CalculatorTest {

    private static Calculator calculator;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before class");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("After class");
    }

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @After
    public void after(){
        calculator = null;
    }

    @Test
    public void testSum(){
        assertEquals(15, calculator.sum(10, 5));
    }

    @Test
    public void testDivision(){
        assertEquals(3, calculator.division(15, 5));
    }

    @Test
    public void testMultiplication(){
        assertEquals(15, calculator.multiplication(3, 5));
    }

    @Test (expected = ArithmeticException.class)
    public void divisionWithException(){
        calculator.division(15, 0);
    }

    @Ignore ("Message for ignored test")
    @Test
    public void ignoredTest(){
        System.out.println("will not print it");
    }

    @Test (timeout = 100)
    public void timeStempTest(){
        while (true);
    }

}
