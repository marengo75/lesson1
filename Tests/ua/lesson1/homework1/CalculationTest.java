package ua.lesson1.homework1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CalculationTest {
    private Calculation c;

    @Before
    public void setUp() throws Exception {
        c = new Calculation();
        System.out.println("BEFORE");
    }

    @Test
    public void testCalc() throws Exception {
        assertEquals(-1, c.calc(10, 20, 30),  0.001f);
    }

    @Test
    public void testCalc2() throws Exception {
        assertEquals(3, c.calc(30, 20, 10), 0.001f);
    }

    @Test(expected = ArithmeticException.class)
    public void testCalcExp() throws Exception {
        c.calc(10, 10, 10);
    }

}
