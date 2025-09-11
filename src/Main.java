import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        OperationsDetector detector = new OperationsDetector();
        Scanner input = new Scanner(System.in);

        System.out.print("Calculadora basica que realiza +,-,*,/,% de dos numeros:\n");
        System.out.println("Ejecuta /e para salir de la calculadora.");

        try{
            while(true){
                String text = input.nextLine();

                if(text.equals("/e")){
                    input.close();
                    break;
                }

                if(text.contains("(")){
                    text = text.replaceAll("\\(.*?\\)", "*" + cal.encapsulatedOperations(text));
                }

                String operador = detector.operator(text);
                if (operador == null) {
                    System.out.println("No se detectó operador válido en: " + text);
                    continue;
                }
                double number1 = Double.parseDouble(text.substring(0,text.indexOf(operador)));
                double number2 = Double.parseDouble(text.substring(text.indexOf(operador) + 1));;

                switch (operador) {
                    case "+": cal.add(number1, number2); break;
                    case "-": cal.subtraction(number1, number2); break;
                    case "*": cal.multiplication(number1, number2); break;
                    case "/": cal.division(number1, number2); break;
                    case "%": cal.percentage(number1, number2); break;
                }
            }
        }
        catch (Exception e){
            System.out.println("Hubo un error en el sistema: " + e);
        }
    }
}