package Polymorphism;

public class methodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(5, 7));
        System.out.println(calc.sum(9.5, 9.7));
        System.out.println(calc.sum(4, 5, 7));

    }

}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    double sum(double a, double b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}
