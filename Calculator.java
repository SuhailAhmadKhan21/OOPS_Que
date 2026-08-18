import java.util.Scanner;

public class Calculator {
    int sum(int x, int y) {
        return x + y;
    }

    int sub(int x, int y) {
        return x - y;
    }

    int mul(int x, int y) {
        return x * y;
    }

    double div(int x, int y) {
        return (double) x / y;
    }
}

class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        Calculator c1 = new Calculator();
        System.out.println("Sum = " + c1.sum(a, b));
        System.out.println("Sub = " + c1.sub(a, b));
        System.out.println("Mul = " + c1.mul(a, b));
        System.out.println("Div = " + c1.div(a, b));
    }
}