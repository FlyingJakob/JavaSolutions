package org.Lektion_14_11_2023;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {


    @Test
    public void TestAdd(){
        Calculator calculator = new Calculator();
        int result = calculator.add(1,2);
        assertEquals(3,result);
    }

    @Test
    public void TestMultiply(){
        Calculator calculator = new Calculator();
        int result1 = calculator.multiply(1,5);
        assertEquals(5,result1);

        int result2 = calculator.multiply(-10,5);
        assertEquals(-50,result2);
    }

    @Test
    public void TestDiv(){
        Calculator calculator = new Calculator();
        double result = calculator.divide(5,2);
        assertEquals(2.5,result);
    }

    @Test
    public void TestSub(){
        Calculator calculator = new Calculator();
        int result = calculator.subtract(9,5);
        assertEquals(4,result);
    }


}
