package com.company;

class Calculator {
    public static float add(float a, float b) {
        return a + b;
    }

    public static float sub(float a, float b) {
        return a - b;
    }

    public static float multiply(float a, float b) {
        return a * b;
    }

    public static float divide(float a, float b) {
        return a / b;
    }
}

public class Main {

    public static void main(String[] args) {
        float result = Calculator.add(2, 5.3f);
        System.out.println(result);
    }
}
