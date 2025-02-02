package org.example;

public class CalculatorService {

    private Calculator calculator;

    public CalculatorService(Calculator calculator) {
        this.calculator = calculator;
    }

    public int add(int a, int b) {
        return calculator.add(a, b);
    }

    public int subtract(int a, int b) {
        return calculator.subtract(a, b);
    }
}
