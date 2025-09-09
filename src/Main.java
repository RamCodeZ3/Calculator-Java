import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Scanner input = new Scanner(System.in);
        boolean activate = true;

        System.out.print("Calculadora basica: +,-,*,/\n");
        try{
            while(activate){
                String text = input.nextLine();
                int number1 = 0;
                int number2 = 0;

                if(text.contains("+")){
                    number1 = Integer.parseInt(text.substring(0,text.indexOf("+")));
                    number2 = Integer.parseInt(text.substring(text.indexOf("+") + 1));

                    cal.add(number1, number2);
                }
                else if (text.contains("-")){
                    number1 = Integer.parseInt(text.substring(0,text.indexOf("-")));
                    number2 = Integer.parseInt(text.substring(text.indexOf("-") + 1));

                    cal.subtraction(number1, number2);
                }

                else if (text.contains("*")){
                    number1 = Integer.parseInt(text.substring(0,text.indexOf("*")));
                    number2 = Integer.parseInt(text.substring(text.indexOf("*") + 1));

                    cal.multiplication(number1, number2);
                }

                else if (text.contains("/")){
                    number1 = Integer.parseInt(text.substring(0,text.indexOf("/")));
                    number2 = Integer.parseInt(text.substring(text.indexOf("/") + 1));
                    cal.division(number1, number2);
                }
            }
        }
        catch (Exception e){
            System.out.println("Hubo un error en el sistema: " + e);
        }
    }
}