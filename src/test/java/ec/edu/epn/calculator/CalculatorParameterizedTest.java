package ec.edu.epn.calculator;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class CalculatorParameterizedTest {
    public float a, b, expected;
    public static Calculator calculator = null;

    @BeforeClass
    public static void setUpClass() {
        calculator = new Calculator();
    }

    public CalculatorParameterizedTest(float a, float b, float expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> parameters() {
        ArrayList<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{2, 3, 5});
        objects.add(new Object[]{5, 3, 8});
        objects.add(new Object[]{12, 13, 25});
        objects.add(new Object[]{20, 30, 50});
        objects.add(new Object[]{4, 1, 5});
        objects.add(new Object[]{67, 3, 70});
        objects.add(new Object[]{6, 3, 9});
        objects.add(new Object[]{1, 1, 2});
        objects.add(new Object[]{2, 33, 35});
        objects.add(new Object[]{2, 13, 15});
        return objects;
    }

    @Test
    public void given_parameters_when_add_then_ok() {
        float actualValue = calculator.add(this.a, this.b);
        assertEquals(expected, actualValue, 0.0001);
    }
}