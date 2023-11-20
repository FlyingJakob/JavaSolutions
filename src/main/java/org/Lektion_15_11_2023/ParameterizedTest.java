package org.Lektion_15_11_2023;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParameterizedTest {

    @org.junit.jupiter.params.ParameterizedTest
    @ValueSource(ints = {2,4,6,8,11})
    public void testEvenNumbers(int number){
        assertTrue(number%2==0);
    }

    @org.junit.jupiter.params.ParameterizedTest
    @ValueSource(strings = {"Jakob","Kalle","Lisa"})
    public void containsLetterA(String str){
        assertTrue(str.contains("a"));
    }

    @Test
    public void testExpectedException() {
        assertThrows(ArithmeticException.class, () -> {
            int result = 10 / 0;
        });
    }



}
