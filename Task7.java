import java.util.Scanner;

public class Task7 {

    public static int add(int a, int b) {
        return a + b;
    }

    public static double subtract(int a, int b) {
        return a - b;
    }

    public static long multiply(int a, int b) {
        return (long) a * b;
    }

    public static float divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
            return 0f;  
        }
        return (float) a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int sum = add(num1, num2);
        double diff = subtract(num1, num2);
        long prod = multiply(num1, num2);
        float quotient = divide(num1, num2);

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + diff);
        System.out.println("Multiplication: " + prod);
        System.out.println("Division: " + quotient);

        scanner.close();
    }
}
