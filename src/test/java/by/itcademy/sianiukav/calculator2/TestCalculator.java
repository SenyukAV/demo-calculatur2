package by.itcademy.sianiukav.calculator2;

import by.itacademy.sianiukav.calculator2.Calculator;
import org.junit.jupiter.api.*;


public class TestCalculator {


    public void testAdd () {
        Calculator calculator = new Calculator();
        double result = calculator.sum(2, 6);
        Assertions.assertEquals(5,result);

    }
}
