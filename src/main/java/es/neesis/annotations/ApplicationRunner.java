package es.neesis.annotations;

import es.neesis.annotations.applications.CalculatorApplication;
import es.neesis.annotations.configuration.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationRunner {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        CalculatorApplication calculatorApplication = context.getBean(CalculatorApplication.class);
        calculatorApplication.startCalculator();
        System.out.println("--------------------");
    }
}
