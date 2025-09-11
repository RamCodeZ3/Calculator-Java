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
        double result = (a * 100)/ b;
        if (result == (double) ((int) result)){
            System.out.println((int)result);
        } else System.out.println(result);
    }

     public String encapsulatedOperations(String operation) {
        // Se define el parametro
        Pattern pattern = Pattern.compile("\\((.*?)\\)");
        Matcher matcher = pattern.matcher(operation);
         if (!matcher.find()) {
             return "No se encontraron paréntesis";
         }

         // Se indetifica el operador y los numeros de la operacion
         String inside = matcher.group(1);
         String operador = detector.operator(inside);
         int pos = inside.indexOf(operador);

         double number1 = Double.parseDouble(inside.substring(0, pos));
         double number2 = Double.parseDouble(inside.substring(pos + 1));

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
