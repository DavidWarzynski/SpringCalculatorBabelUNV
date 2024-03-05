package es.neesis.annotations.applications;

import es.neesis.annotations.services.ICalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculatorApplication {

    @Autowired
    private ICalculatorService calculatorService;

    public double startCalculator( int choice, double operand1, double operand2){
        return this.calculatorService.startCalculator(choice,operand1,operand2);
    }
}
