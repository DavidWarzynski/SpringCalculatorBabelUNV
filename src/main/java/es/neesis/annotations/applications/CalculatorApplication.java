package es.neesis.annotations.applications;

import es.neesis.annotations.services.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculatorApplication {

    @Autowired
    private CalculatorService calculatorService;

    public void startCalculator(){
        this.calculatorService.startCalculator();
    }
}
