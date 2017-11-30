package by.bsu.mmf.calculator;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeTest
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testSum() {
        assertEquals("8 + 2 must be 10", 10, calculator.getSum(8, 2));
    }

    @Test
    public void testSumMinus() {
        assertEquals("8 + (-2) must be 6", 6, calculator.getSum(8, -2));
    }

    @Test
    public void testSumZero() {
        assertEquals("0 + 2 must be 2", 2, calculator.getSum(0, 2));
    }

    @Test
    public void testSumTwoMinus() {
        assertEquals("-5 + (-2) must be -7", -7, calculator.getSum(-5, -2));
    }


    @Test
    public void testDivide() {
        assertEquals("8 / 2 must be 4", 4, calculator.getDivide(8, 2));
    }

    @Test
    public void testDivideZero() {
        assertEquals("0/2 must be 0", 0, calculator.getDivide(0, 2));
    }

    @Test
    public void testDivideByZero() {
        assertEquals("3/0 must Infinity(Integer.MAX_VALUE)", Integer.MAX_VALUE, calculator.getDivide(3, 0));
    }

    @Test
    public void testDivideTwoMinus() {
        assertEquals("(-6) / (-2) must be 3", 3, calculator.getDivide((-6), (-2)));
    }


    @Test
    public void testMultiply() {
        assertEquals("8 * 2 must be 16", 16, calculator.getMultiple(8, 2));
    }

    @Test
    public void testMultiplyByZero() {
        assertEquals("8 * 0 must be 0", 0, calculator.getMultiple(8, 0));
    }

    @Test
    public void testMultiplyMinus() {
        assertEquals("8 * (-2) must be -16", -16, calculator.getMultiple(8, (-2)));
    }

    @Test
    public void testMultiplyTwoMinus() {
        assertEquals("(-8) * (-2) must be 16", 16, calculator.getMultiple((-8), (-2)));
    }

    @Test
    public void testSubtraction() {
        assertEquals("8 - 2 must be 6", 6, calculator.getSubtraction(   8, 2));
    }

    @Test
    public void testSubtractionMinus() {
        assertEquals("8 - (-2) must be 10", 10, calculator.getSubtraction(8, -2));
    }

    @Test
    public void testSubtractionTwoMinus() {
        assertEquals("-5 - (-2) must be -3", -3, calculator.getSubtraction(-5, -2));
    }

    @Test
    public void testSubtractionZero() {
        assertEquals("0 - 2 must be -2", -2, calculator.getSubtraction(0, 2));
    }

}
