import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Scanner input = new Scanner(System.in);
        boolean activate = true;

        System.out.print("Calculadora basica: +,-,*,/");
        try{
            String text = input.nextLine();
            int number1 = 0;
            int number2 = 0;

            System.out.println(number1);
        }
        catch (Exception e){
            System.out.println("Hubo un error en el sistema: " + e);
        }
    }
}