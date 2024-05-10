package com.example.calculatorapp.service;

@org.springframework.stereotype.Service
public class CalculatorService {
    public String hello() {
        return "hello";
    }

    public String calculator() {
        return "Добро пожаловать в калькулятор!";
    }

    public String plusSign(int num1, int num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    public String minusSign(int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    public String multiplySign(int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    public String divideSign(int num1, int num2) {
        return num1 + " / " + num2 + " = " + (num1 / num2);
    }
}
