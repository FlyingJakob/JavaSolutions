package org.Lektion_27_11_2023;

import org.mockito.Mockito;
import org.testng.annotations.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class CalculatorServiceIntegrationTest {
    @Test
    public void testAddFunctionLogsCorrectly() {
        LoggingService mockLoggingService = Mockito.mock(LoggingService.class);
        CalculatorService calculatorService = new CalculatorService(mockLoggingService);
        int expected = 5;
        int actual = calculatorService.add(2, 3);
        assertEquals(expected, actual);
        verify(mockLoggingService).log("Adding 2 and 3: 5");

        assertEquals(7,calculatorService.add(2, 5));
        assertEquals(-6,calculatorService.add(-2, -4));


    }

    @Test
    public void testSubtractFunctionLogsCorrectly() {
        LoggingService mockLoggingService = Mockito.mock(LoggingService.class);
        CalculatorService calculatorService = new CalculatorService(mockLoggingService);
        int expected = 4;
        int actual = calculatorService.subtract(8, 4);
        assertEquals(expected, actual);
        verify(mockLoggingService).log("Subtracting 4 from 8: 4");
    }

    @Test
    public void testDivideFunctionLogsCorrectly(){
        LoggingService mockLoggingService = Mockito.mock(LoggingService.class);
        CalculatorService calculatorService = new CalculatorService(mockLoggingService);
        assertThrows(ArithmeticException.class,() -> calculatorService.divide(5,0));
        verify(mockLoggingService).logError("Cannot divide with zero");
    }

}