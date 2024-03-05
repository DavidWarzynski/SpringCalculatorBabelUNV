package es.neesis.annotations.services;

import org.springframework.stereotype.Service;
import java.util.Scanner;
@Service
public class CalculatorService {

    private Scanner scanner;

 public CalculatorService(){
     this.scanner=new Scanner(System.in);
 }

    public void startCalculator() {
        int choice;
        do {
            System.out.println("Bienvenido a la calculadora, selecciona una operación:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Selecciona una operación: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    performOperation("+");
                    break;
                case 2:
                    performOperation("-");
                    break;
                case 3:
                    performOperation("*");
                    break;
                case 4:
                    performOperation("/");
                    break;
                case 5:
                    System.out.println("Saliendo de la calculadora...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (choice != 5);
    }

    private void performOperation(String operator) {
        System.out.print("Introducir el primer operando: ");
        double operand1 = scanner.nextDouble();
        System.out.print("Introducir el segundo operando: ");
        double operand2 = scanner.nextDouble();

        switch (operator) {
            case "+":
                System.out.println("Resultado: " + (operand1 + operand2));
                break;
            case "-":
                System.out.println("Resultado: " + (operand1 - operand2));
                break;
            case "*":
                System.out.println("Resultado: " + (operand1 * operand2));
                break;
            case "/":
                if (operand2 != 0)
                    System.out.println("Resultado: " + (operand1 / operand2));
                else
                    System.out.println("Error: No se puede dividir por cero");
                break;
            default:
                System.out.println("Operador no válido.");
        }
    }

    public void closeScanner() {
        if (scanner != null) {
            scanner.close();
        }
    }
}
