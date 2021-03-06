package sef.finalactivity;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CalculatorTest{

    @Test
    public void testAdd() {

        int a = 5;
        int b = 10;
        assertEquals(15, (Calculator.add(a,b)));
        assertEquals(15, (Calculator.add(b,a)));

        a = -5;
        b = 10;
        assertEquals(5, (Calculator.add(a,b)));
        assertEquals(5, (Calculator.add(b,a)));

        a = -5;
        b = -10;
        assertEquals(-15, (Calculator.add(a,b)));
        assertEquals(-15, (Calculator.add(b,a)));
    }

    @Test
    public void testSubtract() {

        //test if a > b
        int a = 10;
        int b = 5;
        assertEquals(5, (Calculator.subtract(a, b)));

        a = 10;
        b = -5;
        assertEquals(15, (Calculator.subtract(a, b)));

        a = -10;
        b = -5;
        assertEquals(5, (Calculator.subtract(a, b)));

        //test if a = b
        a = 5;
        b = 5;
        assertEquals(0,(Calculator.subtract(a,b)));

    }

    @Test
    public void testSubtract1() {

        //test if b > a
        int a = 5;
        int b = 10;
        assertEquals(5, (Calculator.subtract(b, a)));

        a = -5;
        b = 10;
        assertEquals(15, (Calculator.subtract(b, a)));

        a = -5;
        b = -10;
        assertEquals(5, (Calculator.subtract(b, a)));
    }

    @Test
    public void testMultiply() {

        int a = 7;
        int b = 3;
        assertEquals(21, (Calculator.multiply(a, b)));
        assertEquals(21, (Calculator.multiply(b, a)));

        a = -7;
        b = 3;
        assertEquals(-21, (Calculator.multiply(a, b)));
        assertEquals(-21, (Calculator.multiply(b, a)));

        a = -7;
        b = -3;
        assertEquals(21, (Calculator.multiply(a, b)));
        assertEquals(21, (Calculator.multiply(b, a)));

        a = 0;
        b = 3;
        assertEquals(0, (Calculator.multiply(a, b)));

        a = 3;
        b = 0;
        assertEquals(0, (Calculator.multiply(a, b)));

    }

    @Test
    public void testDivide() {

        double a = 10.0;
        double b = 5.0;
        assertEquals(2.0, (Calculator.divide(a,b)));

        a = 5.0;
        b = 10.0;
        assertEquals(0.5, (Calculator.divide(a,b)));

        a = -5.0;
        b = 10.0;
        assertEquals(-0.5, (Calculator.divide(a,b)));

        a = -5.0;
        b = -10.0;
        assertEquals(0.5, (Calculator.divide(a,b)));

        a = 0.0;
        b = 10.0;
        assertEquals(0.0, (Calculator.divide(a,b)));

        a = 10.0;
        b = 0.0;
        assertEquals(0.0, (Calculator.divide(a,b)));
    }

}
