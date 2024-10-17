package by.itcademy.sianiukav.calculator2;

import by.itacademy.sianiukav.calculator2.Calculator;
import org.junit.jupiter.api.*;


public class TestCalculator {

@Test
    public void testAdd () {
        Calculator calculator = new Calculator();
        double result = calculator.sum(2.0, 6.0);
        Assertions.assertEquals(8,result,0.001);

    }
}
