package es.neesis.annotations;

import es.neesis.annotations.applications.CalculatorApplication;
import es.neesis.annotations.configuration.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.Scanner;
public class ApplicationRunner {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        CalculatorApplication calculatorApplication = context.getBean(CalculatorApplication.class);
        Scanner scanner = new Scanner(System.in);

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

            if (choice >= 1 && choice <= 4) {
                System.out.print("Introducir el primer operando: ");
                double operand1 = scanner.nextDouble();
                System.out.print("Introducir el segundo operando: ");
                double operand2 = scanner.nextDouble();
                double result = calculatorApplication.startCalculator(choice, operand1, operand2);
                System.out.println("Resultado: " + result);
            } else if (choice != 5) {
                System.out.println("Opción no válida.");
            }
        } while (choice != 5);

        System.out.println("Saliendo de la calculadora...");
        scanner.close();
    }
}
