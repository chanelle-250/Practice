public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {

        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;

    }

    public double divide(double a, double b) {
        try {
        return a / b;
    }catch (ArithmeticException e) {
            System.out.println("Error: divide by zero!");
            return 0.0;
        }
        }
    }
