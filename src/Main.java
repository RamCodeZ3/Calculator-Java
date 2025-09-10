import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Scanner input = new Scanner(System.in);
        boolean activate = true;

        System.out.print("Calculadora basica que realiza +,-,*,/,% de dos numeros:\n");
        System.out.println("Ejecuta /e para salir de la calculadora.");

        try{
            while(activate){
                String text = input.nextLine();
                String operador = "";
                if(text.contains("+")) operador = "+";
                else if(text.contains("-")) operador = "-";
                else if(text.contains("*")) operador = "*";
                else if(text.contains("/")) operador = "/";
                else if(text.contains("%")) operador = "%";
                double number1 = Double.parseDouble(text.substring(0,text.indexOf(operador)));
                double number2 = Double.parseDouble(text.substring(text.indexOf(operador) + 1));;

                switch (operador) {
                    case "+": cal.add(number1, number2); break;
                    case "-": cal.subtraction(number1, number2); break;
                    case "*": cal.multiplication(number1, number2); break;
                    case "/": cal.division(number1, number2); break;
                    case "%": cal.percentage(number1, number2); break;
                }

                if(text.equals("/e")) activate = false;
            }
        }
        catch (Exception e){
            System.out.println("Hubo un error en el sistema: " + e);
        }
    }
}