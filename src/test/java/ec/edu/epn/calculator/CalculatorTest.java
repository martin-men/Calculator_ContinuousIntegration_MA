package ec.edu.epn.calculator;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    public static Calculator calculator = null;

    @BeforeClass
    public static void setUpClass() {
        calculator = new Calculator();
        System.out.println("setUpClass()");
    }

    @Test
    public void given_two_numbers_when_add_then_ok() {
        System.out.println("Test 1");
        assertEquals(8, calculator.add(3, 5), 0.0001);
    }

    @Test
    public void given_two_numbers_when_subtract_then_ok() {
        System.out.println("Test 2");
        assertEquals(6, calculator.subtract(8, 2), 0.0001);
    }

    @Test(timeout = 150)
    public void given_a_time_when_on_time_then_ok() {
        System.out.println("Test 3");
        calculator.setTimeout(100);
    }
}