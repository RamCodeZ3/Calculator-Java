public class Calculator {
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

}
