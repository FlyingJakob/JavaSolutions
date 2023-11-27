package org.Lektion_27_11_2023;

public class CalculatorService {
    LoggingService loggingService;
    public CalculatorService(LoggingService loggingService) {
        this.loggingService = loggingService;
    }

    public int add(int a, int b) {
        int result = a + b;
        loggingService.log("Adding " + a + " and " + b + ": " + result);

        return result;
    }

    public int subtract(int a,int b){
        int result = a-b;
        loggingService.log("Subtracting " + b + " from " + a + ": " + result);
        return result;
    }

    public double divide(double a,double b){
        if (b == 0){
            loggingService.logError("Cannot divide with zero");
            throw new ArithmeticException();
        }
        double result = a/b;
        loggingService.log("Dividing "+a+" with "+b+" : "+result);
        return result;
    }


}
