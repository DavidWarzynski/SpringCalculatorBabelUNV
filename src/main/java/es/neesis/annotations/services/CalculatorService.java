package es.neesis.annotations.services;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements ICalculatorService{

    public double startCalculator(int choice, double operand1, double operand2) {
        switch (choice) {
            case 1:
                return performOperation("+", operand1, operand2);
            case 2:
                return performOperation("-", operand1, operand2);
            case 3:
                return performOperation("*", operand1, operand2);
            case 4:
                return performOperation("/", operand1, operand2);
                default:
                return 0;
        }
    }

    private double performOperation(String operator, double operand1, double operand2) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 != 0)
                    return operand1 / operand2;
                else {
                   return 0;
                }
            default:
                return 0;
        }
    }

}
