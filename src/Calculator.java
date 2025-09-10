import java.util.regex.*;
import java.util.*;

public class Calculator {
    OperationsDetector detector = new OperationsDetector();
    public void add(double a, double b) {
        double result = a + b;
        if (result == (double) ((int) result)){
            System.out.println((int)result);
        } else System.out.println(result);

    }
    public void subtraction(double a, double b) {
        double result = a - b;
        if (result == (double) ((int) result)){
            System.out.println((int)result);
        } else System.out.println(result);
    }

    public void multiplication(double a, double b) {
        double result = a * b;
        if (result == (double) ((int) result)){
            System.out.println((int)result);
        } else System.out.println(result);
    }

    public void division(double a, double b) {
        double result = a / b;
        if (result == (double) ((int) result)){
            System.out.println((int)result);
        } else System.out.println(result);
    }

    public void percentage(double a, double b) {
        double result = a % b;
        if (result == (double) ((int) result)){
            System.out.println((int)result);
        } else System.out.println(result);
    }

     public String encapsulatedOperations(String operation) {
        // Se define el parametro
        Pattern pattern = Pattern.compile("\\((.*?)\\)");
        Matcher matcher = pattern.matcher(operation);
        // Se indetifica el operador y los numeros de la operacion
        String operador = detector.operator(operation);
        double number1 = Double.parseDouble(matcher.group(1).substring(0,operation.indexOf(operador)));
        double number2 = Double.parseDouble(matcher.group(1).substring(operation.indexOf(operador) + 1));

        switch (operador) {
            case "+": return String.valueOf(number1 + number2);
            case "-": return String.valueOf(number1 - number2);
            case "*": return String.valueOf(number1 * number2);
            case "/": return String.valueOf(number1 / number2);
            case "%": return String.valueOf(number1 % number2);
            default: return "Operador no válido";
        }
    }
}
