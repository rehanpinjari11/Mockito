package org.example;

// CalculatorServiceTest.java

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
//import static org.junit.Assert.*;

public class CalculatorServiceTest {

    private Calculator calculator;
    private CalculatorService calculatorService;

    @Before
    public void setUp() {
        // Create a mock instance of the Calculator class
        calculator = mock(Calculator.class);

        // Inject the mock into the CalculatorService class
        calculatorService = new CalculatorService(calculator);
    }

    @Test
    public void testAdd() {
        // Define the behavior of the mock for the add method
        when(calculator.add(10, 20)).thenReturn(30);

        // Perform the test
        int result = calculatorService.add(10, 20);

        // Assert that the result is as expected
        assertEquals(30, result);

        // Verify that the add method was called once
        verify(calculator).add(10, 20);
    }

    @Test
    public void testSubtract() {
        // Define the behavior of the mock for the subtract method
        when(calculator.subtract(50, 30)).thenReturn(20);

        // Perform the test
        int result = calculatorService.subtract(50, 30);

        // Assert that the result is as expected
        assertEquals(20, result);

        // Verify that the subtract method was called once
        verify(calculator).subtract(50, 30);
    }

}