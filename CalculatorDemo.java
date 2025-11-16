class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of two ints: " + calc.add(10, 20));
        System.out.println("Sum of two doubles: " + calc.add(2.5, 3.5));
        System.out.println("Sum of three ints: " + calc.add(10, 20, 30));
    }
}